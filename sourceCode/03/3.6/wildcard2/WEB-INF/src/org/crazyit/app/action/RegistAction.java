package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class RegistAction
	extends ActionSupport
{
	// 封装用户请求参数的两个成员变量
	private String username;
	private String password;
	// username的setter和getter方法
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	// password的getter和setter方法
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	// Action包含的注册控制逻辑
	public String execute() throws Exception
	{
		ActionContext.getContext().getSession()
			.put("user" , getUsername());
		addActionMessage("恭喜您," + getUsername() + ",您已经注册成功！");
		return SUCCESS;
	}
}