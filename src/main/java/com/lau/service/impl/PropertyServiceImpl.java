package com.lau.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lau.dao.PropertyDao;
import com.lau.pojo.Property;
import com.lau.service.PropertyService;

@Service("propertyService")
public class PropertyServiceImpl implements PropertyService{

	@Resource
	private PropertyDao propertyDao;
	@Override
	public int add(Property property) {
		propertyDao.add(property);
		return property.getId();
	}
	@Override
	public int addMore(List<Property> list) {
		return propertyDao.addMore(list);
	}

	@Override
	public int deleteById(String ids) {
		return propertyDao.deleteById(Property.class, ids);
	}

	@Override
	public void update(Property t) {
		propertyDao.update(t);
	}

	@Override
	public Property queryById(int id) {
		return propertyDao.queryById(Property.class, id);
	}

	@Override
	public List<Property> queryByPage(int page, int rows) {
		return propertyDao.queryByPage(Property.class, page, rows);
	}

	@Override
	public int getTotal() {
		return propertyDao.getTotal(Property.class);
	}
	@Override
	public List<Property> queryByCid(int cid) {
		return propertyDao.quertyByCid(cid);
	}

}
