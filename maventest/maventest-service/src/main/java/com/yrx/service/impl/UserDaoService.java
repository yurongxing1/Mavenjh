package com.yrx.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yrx.pojo.Depar;
import com.yrx.pojo.User;

public interface UserDaoService {

	/**
	 * 查询全部用户信息
	 * @return
	 */
	public List<User> findall();
	
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 删除用户信息
	 * @param id
	 * @return
	 */
	public int delUser(@Param("id")int id);

	/**
	 * 数据回显
	 * @param id
	 * @return
	 */
	public User huiUser(@Param("id")int id);
	
	/**
	 * 查询部门
	 * @return
	 */
	public List<Depar> finddep();
	
	/**
	 * 修改信息
	 * @return
	 */
	public int upUser(User user);
}
