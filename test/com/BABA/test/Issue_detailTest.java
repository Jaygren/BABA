package com.BABA.test;

/**
 * 统计数目
 * 
 * 关联表集
 */
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.BABA.dao.IssueDao;
import com.BABA.dao.Issue_detailDao;
import com.BABA.pojo.Issue_detail;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class Issue_detailTest {
@Autowired 
Issue_detailDao issue_detailDao;
@Autowired 
IssueDao issueDao;

@Test
public void Issue_detailList(){
	Set<Issue_detail> issue_details=issueDao.get(1).getIssue_details();
	
	//统计数目
	System.out.println("数目："+issue_details.size());
	
	//获取关联表信息
	for(Issue_detail issue_detail:issue_details){
		System.out.println("问题编号："+issue_detail.getVersion());
	}
}
}
