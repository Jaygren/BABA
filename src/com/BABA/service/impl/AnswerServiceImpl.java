package com.BABA.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BABA.pojo.Answer;
import com.BABA.service.AnswerService;
@Service
public class AnswerServiceImpl extends BaseServiceImpl<Answer> implements AnswerService{
	//三表关联
	@SuppressWarnings("unchecked")
	@Override
	public List<Answer> listAnswers4Issue() {
		// TODO Auto-generated method stub
		String hql="select a from Answer a inner join fetch a.issue_detail order by a.id desc";
		return find(hql);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Answer> listAnswers4Inf() {
		// TODO Auto-generated method stub
		String hql="select a from Answer a inner join fetch a.inf order by a.id desc";
		return find(hql);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Answer> listAnswers4Plan() {
		// TODO Auto-generated method stub
		String hql="select a from Answer a inner join fetch a.plan order by a.id desc";
		return find(hql);
	}
	
	
}
