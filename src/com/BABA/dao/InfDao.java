package com.BABA.dao;

import java.util.List;

import com.BABA.pojo.Inf;

public interface InfDao extends BaseDao<Inf> {
	public List<Inf> listInfByState(String state);
}
