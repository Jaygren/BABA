package com.BABA.service.impl;


import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.BABA.pojo.Users;
import com.BABA.service.UsersService;
@Service
public class UsersServiceImpl extends BaseServiceImpl<Users> implements UsersService{

	@Override
	public Users getByUId(String usersId) {
		// TODO Auto-generated method stub
		DetachedCriteria dc=DetachedCriteria.forClass(Users.class);
		dc.add(Restrictions.eq("usersId", usersId));
		return (Users) findByCriteria(dc).get(0);
	}
}
