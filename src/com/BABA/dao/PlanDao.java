package com.BABA.dao;

import java.util.List;

import com.BABA.pojo.Plan;

public interface PlanDao extends BaseDao<Plan>{
	public List<Plan> listPlans();
}
