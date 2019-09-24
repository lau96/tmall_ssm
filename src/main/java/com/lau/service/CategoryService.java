package com.lau.service;

import java.util.List;

import com.lau.pojo.Category;

public interface CategoryService {

	public int add(Category category);
	public int addMore(List<Category> list);
	public int deleteById(String ids);
	public void update(Category t);
	public Category queryById(int id);
	public List<Category> queryByPage(int page,int rows);
	public int getTotal();
}
