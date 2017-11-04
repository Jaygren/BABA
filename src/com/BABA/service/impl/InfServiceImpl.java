package com.BABA.service.impl;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.BABA.pojo.Inf;
import com.BABA.service.InfService;
@Service
public class InfServiceImpl extends BaseServiceImpl<Inf> implements InfService {

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
