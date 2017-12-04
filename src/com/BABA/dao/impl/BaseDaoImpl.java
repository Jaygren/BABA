package com.BABA.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.BABA.dao.BaseDao;
@Repository
public abstract class BaseDaoImpl<T> extends DelegateDAO implements BaseDao<T>{

	protected Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
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
		//去除重复查询
		dc.setResultTransformer(DetachedCriteria.DISTINCT_ROOT_ENTITY);
		return findByCriteria(dc);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<T> list(int id) {
		// TODO Auto-generated method stub
		DetachedCriteria dc=DetachedCriteria.forClass(clazz);
		dc.addOrder(Order.desc("id"));
		dc.add(Restrictions.eq("user.id",id));
		//去除重复查询
		dc.setResultTransformer(DetachedCriteria.DISTINCT_ROOT_ENTITY);
		return findByCriteria(dc);
	}
}
