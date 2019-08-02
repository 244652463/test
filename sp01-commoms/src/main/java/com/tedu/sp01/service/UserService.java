package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	//通过用户id增加用户积分
	void addScore(Integer id, Integer score);
}
