package com.BABA.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.BABA.dao.PlanDao;
import com.BABA.pojo.Plan;

@Repository
public class PlanDaoImpl extends BaseDaoImpl<Plan> implements PlanDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Plan> listPlans() {
		// TODO Auto-generated method stub
		String hql="select p from Plan p inner join fetch p.plan_detail order by p.id desc";
		return find(hql);
	}
}
