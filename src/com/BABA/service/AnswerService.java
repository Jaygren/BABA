package com.BABA.service;

import java.util.List;

import com.BABA.pojo.Answer;

public interface AnswerService extends BaseService<Answer>{
	public List<Answer> listAnswers4Issue();
	public List<Answer> listAnswers4Inf();
	public List<Answer> listAnswers4Plan();
	
	
}
