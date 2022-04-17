package org.action;

import org.apache.commons.lang.StringUtils;
import org.buisnessLogics.user;
import org.service.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private user user;

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public void validate() {
		if(StringUtils.isEmpty(user.getUserid())) {
			System.out.println("!");
			addFieldError("user.userid", "Please enter userID");
		}
		if(StringUtils.isEmpty(user.getPassword())) {
			addFieldError("user.password", "Please enter password");
		}
	}

	public String execute()
	{
		LoginService ls = new LoginService();
		if(ls.validateUser(user))
			return SUCCESS;
		addFieldError("user.userid", "Wrong Credentials!..");
		return LOGIN;
		
	}
}

