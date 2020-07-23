package com.yrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yrx.dao.UserDao;
import com.yrx.pojo.Depar;
import com.yrx.pojo.User;
@Transactional
@Service("userservice")
public class UserDaoServiceImpl implements UserDaoService {

	@Autowired
	private UserDao userdao;
	
	@Override
	public List<User> findall() {
		return userdao.findall();
	}

	@Override
	public int addUser(User user) {
		return userdao.addUser(user);
	}

	@Override
	public int delUser(int id) {
		return userdao.delUser(id);
	}

	@Override
	public User huiUser(int id) {
		return userdao.huiUser(id);
	}

	@Override
	public int upUser(User user) {
		return userdao.upUser(user);
	}

	@Override
	public List<Depar> finddep() {
		return userdao.finddep();
	}

}
