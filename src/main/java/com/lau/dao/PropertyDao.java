package com.lau.dao;

import java.util.List;

import com.lau.pojo.Property;

public interface PropertyDao extends BaseDao<Property>{
	public List<Property> quertyByCid(int cid);
}
