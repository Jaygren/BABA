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

import com.BABA.pojo.Inf;
import com.BABA.pojo.Users;
import com.BABA.service.InfService;
import com.BABA.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class Inftest extends AbstractJUnit4SpringContextTests{

	@Autowired
	UsersService usersService;
	@Autowired
    InfService infService;
    
    @Test
    public void InfSave(){
    Date date=new Date(); 
    	
    Users users=new Users();
    users=usersService.get(1);
    Inf inf=new Inf("test5",date,18,"发布","test5");
    inf.setUser(users);
    infService.save(inf);
    }
}
