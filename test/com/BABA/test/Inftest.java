package com.BABA.test;
/**
 * 外键绑定测试
 * 
 */
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.BABA.dao.InfDao;
import com.BABA.dao.UsersDao;
import com.BABA.pojo.Inf;
import com.BABA.pojo.Users;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class Inftest extends AbstractJUnit4SpringContextTests{

	@Autowired
	UsersDao usersDao;
	@Autowired
    InfDao infDao;
    
    @Test
    public void InfSave(){
    Date date=new Date(); 
    	
    Users users=new Users();
    users=usersDao.get(1);
    Inf inf=new Inf("test5",date,18,"发布","test5");
    inf.setUser(users);
    infDao.save(inf);
    }
}
