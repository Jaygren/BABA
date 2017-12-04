package com.BABA.dao;

import java.util.List;

public interface BaseDao<T> {
	//CURD
	public Integer save(Object object);

	public void update(Object object);

	public T get(int id);

	public List<T> list();

	public List<T>list(int id);
	
	public void delete(Object object);
}
