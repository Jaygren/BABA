package com.BABA.service;

import java.util.List;

import com.BABA.pojo.Plan;

public interface PlanService extends BaseService<Plan>{
	public List<Plan> listPlans();
}
