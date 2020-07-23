package com.yrx.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yrx.pojo.Depar;
import com.yrx.pojo.User;
import com.yrx.service.impl.UserDaoService;

@Controller
public class UserController {

	@Resource
	private UserDaoService daoService;
	
	@RequestMapping("/all")
	public String findll(Model model) {
		List<User> list = daoService.findall();
		model.addAttribute("list", list);
		return "homepage";
	}
	
	//删除数据
		@RequestMapping("del")
		public void deluser(int id,HttpServletRequest request,HttpServletResponse response) throws IOException {
			PrintWriter out = response.getWriter();
			int row = daoService.delUser(id);
			boolean result;
			if(row>0) {
				result = true;
			}else {
				result = false;
			}
			out.print(result);
		}
	
		//跳转添加页面
		@RequestMapping("/add")
		public String add() {
			return"adduser";
		}
		
		//添加数据
		@RequestMapping("/adduser")
		public void adduser(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
			PrintWriter out = response.getWriter();
			int row = daoService.addUser(user);
			boolean result;
			if(row>0) {
				result = true;
			}else {
				result = false;
			}
			out.print(result);
		}
		
		//回显信息
		@RequestMapping("/findid")
		public String findid(int id,Model model) {
			User user = new User();
			user = daoService.huiUser(id);
			List<Depar> list = daoService.finddep();
			model.addAttribute("list", list);
			model.addAttribute("user", user);
			return "update";
		}
		
		//修改信息
		@RequestMapping("/update")
		public void update(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
			PrintWriter out = response.getWriter();
			int row = daoService.upUser(user);
			boolean result;
			if(row>0) {
				result = true;
			}else {
				result = false;
			}
			out.print(result);
		}
}
