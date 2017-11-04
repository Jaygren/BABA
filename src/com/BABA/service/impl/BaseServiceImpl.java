package com.BABA.service.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BABA.service.BaseService;

@Service
public abstract class BaseServiceImpl<T> extends ServiceDelegateDAO  implements BaseService<T> {

	protected Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		// TODO Auto-generated constructor stub
		 ParameterizedType type = (ParameterizedType) getClass()
	                .getGenericSuperclass();    
		 clazz=(Class<T>) type.getActualTypeArguments()[0];  
	}
	
	@Transactional
	@Override
	public Integer save(Object object) {
		// TODO Auto-generated method stub
		return (Integer)super.save(object);
	}
	
	@Transactional(readOnly=true)
	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
		return get(clazz,id);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		DetachedCriteria dc=DetachedCriteria.forClass(clazz);
		dc.addOrder(Order.desc("id"));
		return findByCriteria(dc);
	}
}
