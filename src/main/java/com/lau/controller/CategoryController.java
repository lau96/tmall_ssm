package com.lau.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.lau.pojo.Category;
import com.lau.pojo.Property;
import com.lau.service.CategoryService;
import com.lau.service.PropertyService;
import com.lau.util.Constant;

@Controller
@MultipartConfig
public class CategoryController {

	@Resource
	private CategoryService categoryService;
	private PropertyService propertyService;

	@RequestMapping("/forehome")
	public String forehome() {
		return "fore/home";
	}

	@RequestMapping("/admin_category_list")
	public String admin_category_list(HttpServletRequest req) {
		int page;
		int rows;
		try {
			page = Integer.parseInt(req.getParameter("page"));
		} catch (Exception e) {
			page = 1;
		}
		try {
			rows = Integer.parseInt(req.getParameter("rows"));
		} catch (Exception e) {
			rows = 5;
		}

		int total = categoryService.getTotal();
		int maxPage = total % 5 == 0 ? total / 5 : total / 5 + 1;
		if (page > maxPage)
			page = maxPage;

		List<Category> list = categoryService.queryByPage(page, rows);
		req.setAttribute("cs", list);
		req.setAttribute("totalPage", maxPage);
		req.setAttribute("page", page);
		req.setAttribute("total", total);
		return "admin/listCategory";
	}

	@RequestMapping("/admin_category_delete")
	public String admin_category_delete(HttpServletRequest req) {
		String id = req.getParameter("id");
		categoryService.deleteById(id);
		return "redirect:admin_category_list";
	}

	@RequestMapping("/admin_category_edit")
	public String admin_category_edit(HttpServletRequest req) {
		String id = req.getParameter("id");
		Category category = categoryService.queryById(Integer.parseInt(id));
		req.setAttribute("c", category);
		return "admin/editCategory";
	}

	@RequestMapping("/admin_category_add")
	public String admin_category_add(String name,MultipartFile image,HttpServletRequest req) throws IOException, ServletException {
		Category category = new Category();
		category.setName(name);
		categoryService.add(category);
		req.setAttribute("c", category);

		// 获取保存数据自增长id值，用id设置为上传图片名称
		int id = category.getId();
		// 获取服务器存放上传文件的路径地址
		String path = req.getServletContext().getRealPath(Constant.category_path);
		if(image!=null) {
			String fileName = image.getOriginalFilename();
			String regex = fileName.substring(fileName.lastIndexOf("."));
			image.transferTo(new File(path,id+regex));
		}
		
		return "redirect:admin_category_list";
	}
	
	@RequestMapping("/admin_property_list")
	public String admin_property_list(int cid,HttpServletRequest req){
		Category c = categoryService.queryById(cid);
		List<Property> ps = propertyService.queryByCid(cid);
		req.setAttribute("c", c);
		req.setAttribute("ps", ps);
		return "admin/listProduct";
	}
	@RequestMapping("/admin_product_list")
	public String admin_product_list(int cid,HttpServletRequest req){
		Category c = categoryService.queryById(cid);
		List<Property> ps = propertyService.queryByCid(cid);
		req.setAttribute("c", c);
		req.setAttribute("ps", ps);
		return "admin/listProduct";
	}
}
