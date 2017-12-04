package com.BABA.dao.impl;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.BABA.dao.InfDao;
import com.BABA.pojo.Inf;

@Repository
public class InfDaoImpl extends BaseDaoImpl<Inf> implements InfDao {

	//按状态查找
	@SuppressWarnings("unchecked")
	@Override
	public List<Inf> listInfByState(String state) {
		// TODO Auto-generated method stub
		DetachedCriteria dc=DetachedCriteria.forClass(Inf.class);
		dc.add(Restrictions.eq("state",state));
		return findByCriteria(dc);
	}
}
