package com.BABA.dao.impl;


import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.BABA.dao.UsersDao;
import com.BABA.pojo.Users;

@Repository
public class UsersDaoImpl extends BaseDaoImpl<Users> implements UsersDao{

	@Override
	public Users getByUId(String usersId) {
		// TODO Auto-generated method stub
		DetachedCriteria dc=DetachedCriteria.forClass(Users.class);
		dc.add(Restrictions.eq("usersId", usersId));
		return (Users) findByCriteria(dc).get(0);
	}
}
