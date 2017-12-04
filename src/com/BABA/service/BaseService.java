package com.BABA.service;

import com.BABA.dao.AnswerDao;
import com.BABA.dao.FeedbackDao;
import com.BABA.dao.InfDao;
import com.BABA.dao.Issue_detailDao;
import com.BABA.dao.MomentDao;
import com.BABA.dao.UsersDao;

public interface BaseService{
//CURD Service
	public UsersDao usersDao();
	public InfDao infDao();
	public FeedbackDao feedbackDao();
	public MomentDao momentDao();
	public Issue_detailDao issue_detailDao();
	public AnswerDao answerDao();
}
