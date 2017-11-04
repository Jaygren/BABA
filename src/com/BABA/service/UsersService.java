package com.BABA.service;


import com.BABA.pojo.Users;

public interface UsersService extends BaseService<Users>{
public Users getByUId(String usersId);
}
