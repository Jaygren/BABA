package com.BABA.dao.impl;

import org.springframework.stereotype.Repository;

import com.BABA.dao.FeedbackDao;
import com.BABA.pojo.Feedback;

@Repository
public class FeedbackDaoImpl extends BaseDaoImpl<Feedback> implements FeedbackDao{

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Feedback> listFeedback() {
//		// TODO Auto-generated method stub
//		String hql="select f from Feedback f inner join fetch f. order by p.id desc";
//		return find(hql);
//	}
}
