package com.BABA.service;

import java.util.List;

public interface BaseService<T> {
//CURD
public Integer save(Object object);

public void update(Object object);

public T get(int id);

public List<T> list();

public void delete(Object object);

}
