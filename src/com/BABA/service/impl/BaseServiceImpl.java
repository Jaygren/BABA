package com.BABA.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BABA.dao.AnswerDao;
import com.BABA.dao.FeedbackDao;
import com.BABA.dao.InfDao;
import com.BABA.dao.Issue_detailDao;
import com.BABA.dao.MomentDao;
import com.BABA.dao.UsersDao;
import com.BABA.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService{
	@Autowired
    UsersDao usersDao;
	@Autowired
	InfDao infDao;
	@Autowired
	FeedbackDao feedbackDao;
	@Autowired
	MomentDao momentDao;
	@Autowired
	Issue_detailDao issue_detailDao;
	@Autowired
	AnswerDao answerDao;
	@Override
	public UsersDao usersDao() {
		// TODO Auto-generated method stub
		return usersDao;
	}
	@Override
	public InfDao infDao() {
		// TODO Auto-generated method stub
		return infDao;
	}
	@Override
	public FeedbackDao feedbackDao() {
		// TODO Auto-generated method stub
		return feedbackDao;
	}
	@Override
	public MomentDao momentDao() {
		// TODO Auto-generated method stub
		return momentDao;
	}
	@Override
	public Issue_detailDao issue_detailDao() {
		// TODO Auto-generated method stub
		return issue_detailDao;
	}
	@Override
	public AnswerDao answerDao() {
		// TODO Auto-generated method stub
		return answerDao;
	}
}
