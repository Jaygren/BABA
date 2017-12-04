package com.BABA.dao;


import com.BABA.pojo.Users;

public interface UsersDao extends BaseDao<Users>{
public Users getByUId(String usersId);
}
