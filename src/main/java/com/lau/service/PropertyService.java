package com.lau.service;

import java.util.List;

import com.lau.pojo.Property;

public interface PropertyService {
	public int add(Property property);
	public int addMore(List<Property> list);
	public int deleteById(String ids);
	public void update(Property t);
	public Property queryById(int id);
	public List<Property> queryByCid(int cid);
	public List<Property> queryByPage(int page,int rows);
	public int getTotal();
}
