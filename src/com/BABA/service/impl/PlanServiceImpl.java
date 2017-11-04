package com.BABA.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BABA.pojo.Plan;
import com.BABA.service.PlanService;
@Service
public class PlanServiceImpl extends BaseServiceImpl<Plan> implements PlanService{

	@SuppressWarnings("unchecked")
	@Override
	public List<Plan> listPlans() {
		// TODO Auto-generated method stub
		String hql="select p from Plan p inner join fetch p.plan_detail order by p.id desc";
		return find(hql);
	}
}
