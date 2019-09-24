package com.lau.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	public int add(T t);
	public int addMore(List<T> list);
	public int deleteById(Class<?> cls,Serializable ids);
	public void update(T t);
	public T queryById(Class<?> cls,Serializable id);
	public List<T> queryByPage(Class<?> cls,int page,int rows);
	public int getTotal(Class<?> cls);
}
