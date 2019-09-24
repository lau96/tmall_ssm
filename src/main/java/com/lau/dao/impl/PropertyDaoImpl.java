package com.lau.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.lau.dao.PropertyDao;
import com.lau.pojo.Property;

@Repository("propertyDao")
public class PropertyDaoImpl extends BaseDaoImpl<Property> implements PropertyDao{

	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public int add(Property property) {
		getSqlSession().insert("Property.add", property);
		return property.getId();
	}
	@Override
	public List<Property> quertyByCid(int cid) {
		return getSqlSession().selectList("Property.queryByCid", cid);
	}
}
