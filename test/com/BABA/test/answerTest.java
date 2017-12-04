package com.BABA.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.BABA.dao.AnswerDao;
import com.BABA.pojo.Answer;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class answerTest extends AbstractJUnit4SpringContextTests{
@Autowired
AnswerDao answerDao;

@Test 
public void listAnswers4Issue(){
	List<Answer>answers=new ArrayList();
	answers=answerDao.listAnswers4Issue();
	for(Answer answer:answers){
	System.out.println("编号："+answer.getId());
	System.out.println("问题："+answer.getIssue_detail().getTitle());
}
	}
}
