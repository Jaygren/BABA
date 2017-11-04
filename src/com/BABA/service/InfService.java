package com.BABA.service;

import java.util.List;

import com.BABA.pojo.Inf;

public interface InfService extends BaseService<Inf> {
	public List<Inf> listInfByState(String state);
}
