package com.BABA.dao;

import java.util.List;

import com.BABA.pojo.Answer;

public interface AnswerDao extends BaseDao<Answer>{
	public List<Answer> listAnswers4Issue();
	public List<Answer> listAnswers4Inf();
	public List<Answer> listAnswers4Plan();
	public List<Answer> listAnswers4Issue(int id);
	public List<Answer> listAnswers4Comment(int id);
}
