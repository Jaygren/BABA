package com.BABA.test;

/**
 * 测试通用类CRUL测试
 *   
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.BABA.pojo.Users;
import com.BABA.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class Userstest extends AbstractJUnit4SpringContextTests{
@Autowired
UsersService usersService;

@Test
public void UsersSave(){
	Users users=new Users("test8","123456","test8","18138059836",null);
	usersService.save(users);
}

@Test
public void Usersget(){
	Users users=new Users();
//	users=usersService.get(10);
	users=usersService.getByUId("test1");
	System.out.println("用户id："+users.getUsersId());
}

@Test
public void UsersUpdate(){
	Users users=new Users();
	users=usersService.get(10);
	System.out.println("用户id："+users.getUsersId());
	users.setUsersId("test");
	usersService.update(users);
	users=usersService.get(10);
	System.out.println("用户id："+users.getUsersId());
}

@Test
public void UsersDelete(){
	Users users=new Users();
	users=usersService.get(10);
	usersService.delete(users);
}
}
