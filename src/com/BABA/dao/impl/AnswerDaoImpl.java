package com.BABA.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.BABA.dao.AnswerDao;
import com.BABA.pojo.Answer;

@Repository
public class AnswerDaoImpl extends BaseDaoImpl<Answer> implements AnswerDao{
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
	@SuppressWarnings("unchecked")
	@Override
	public List<Answer> listAnswers4Issue(int id) {
		// TODO Auto-generated method stub
		String hql="select a from Answer a inner join fetch a.issue_detail where a.user.id="+id+" and a.answer_id=0 order by a.id desc";
		return find(hql);
	}
	@Override
	public List<Answer> listAnswers4Comment(int id) {
		// TODO Auto-generated method stub
		String hql="select a from Answer a where a.user.id="+id+" and a.answer_id !=0 order by a.id desc";
		return find(hql);
	}
	
	
}
