package com.ty.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Arrays;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ty.entity.User;
import com.ty.entity.UserList;

@Controller
public class UserController {
	public SimpleDateFormat[] dateFormats = { 
			new SimpleDateFormat("yyyy/MM/dd"),
			new SimpleDateFormat("yyyy-MM-dd") };
	/**
	 * 1.参数1：需要转换的类型
	 * 2.参数2：日期的格式
	 * 3.false：日期不能为空
	 */
	@InitBinder
	public void initDataConvert(ServletRequestDataBinder binder){
		binder.registerCustomEditor(Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"),false));
	}
	
	/**
	 * 时间的格式化
	 */
	@RequestMapping("/login")
	public String TestDataInitBinder(User user) {
		System.out.println(user);
		return "/index1.jsp";
	}
	
	/**
	 * 接收数组类型的参数
	 */
	@RequestMapping("/arrays")
	public String TestArrays(int[] ids){
		System.out.println(Arrays.toString(ids));
		return "/index1.jsp";
	}
	
	/**
	 * 接收list的参数
	 * 思路：单独做一个list的实现类，利用这个实现类接收list传过来的值。
	 */
	@RequestMapping("/lists")
	public String TestLists(UserList userList){
		System.out.println(userList.getLists());
		return "/index1.jsp";
	}
}
