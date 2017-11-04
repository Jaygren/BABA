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

import com.BABA.pojo.Issue_detail;
import com.BABA.service.IssueService;
import com.BABA.service.Issue_detailService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class Issue_detailTest {
@Autowired 
Issue_detailService issue_detailService;
@Autowired 
IssueService issueService;

@Test
public void Issue_detailList(){
	Set<Issue_detail> issue_details=issueService.get(1).getIssue_details();
	
	//统计数目
	System.out.println("数目："+issue_details.size());
	
	//获取关联表信息
	for(Issue_detail issue_detail:issue_details){
		System.out.println("问题编号："+issue_detail.getVersion());
	}
}
}
