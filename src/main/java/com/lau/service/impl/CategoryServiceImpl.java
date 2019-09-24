package com.lau.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lau.dao.CategoryDao;
import com.lau.pojo.Category;
import com.lau.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	@Resource
	private CategoryDao categoryDao;
	@Override
	public int add(Category category) {
		categoryDao.add(category);
		return category.getId();
	}
	@Override
	public int addMore(List<Category> list) {
		return categoryDao.addMore(list);
	}

	@Override
	public int deleteById(String ids) {
		return categoryDao.deleteById(Category.class, ids);
	}

	@Override
	public void update(Category t) {
		categoryDao.update(t);
	}

	@Override
	public Category queryById(int id) {
		return categoryDao.queryById(Category.class, id);
	}

	@Override
	public List<Category> queryByPage(int page, int rows) {
		return categoryDao.queryByPage(Category.class, page, rows);
	}

	@Override
	public int getTotal() {
		return categoryDao.getTotal(Category.class);
	}

}
