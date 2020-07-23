package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yrx.pojo.User;
import com.yrx.service.impl.UserDaoService;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = { "classpath*:resources/ApplicationContext.xml"}) // 加载配置文件
public class Usertest {

	@Autowired
	private UserDaoService service;
	
	//查询测试
	@Test
	public void findall() {
		List<User> list = service.findall();
		System.out.println("姓名\t年龄\t部门");
		for (User user : list) {
			System.out.println(user.getName()+"\t"+user.getSex()+"\t"+user.getDepar().getCompany());
		}
	}
}
