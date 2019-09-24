package com.lau.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.lau.dao.BaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{

	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public int add(T t) {
		
		return 0;
	}

	@Override
	public int addMore(List<T> list) {
		int count = 0;
		for(T t:list) {
			if(getSqlSession().insert(t.getClass().getSimpleName()+".add", t)==1) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int deleteById(Class<?> cls, Serializable ids) {
		return getSqlSession().delete(cls.getSimpleName()+".deleteById", ids);
	}

	@Override
	public void update(T t) {
		getSqlSession().update(t.getClass().getSimpleName()+".update", t);
	}

	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return getSqlSession().selectOne(cls.getSimpleName()+".queryById", id);
	}

	@Override
	public List<T> queryByPage(Class<?> cls, int page, int rows) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", (page-1)*rows);
		map.put("rows", rows);
		return getSqlSession().selectList(cls.getSimpleName()+".queryByPage", map);
	}

	@Override
	public int getTotal(Class<?> cls) {
		return getSqlSession().selectOne(cls.getSimpleName()+".getTotal");
	}

}
