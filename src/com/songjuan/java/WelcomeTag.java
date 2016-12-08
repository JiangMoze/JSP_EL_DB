package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class WelcomeTag extends SimpleTagSupport{
	private String user;
	public void setUser(String user){
		this.user=user;
	}
	public void doTag() throws JspException,IOException{
		JspWriter out=getJspContext().getOut();
		try {
			if(user==null){
				out.print("Welcome,Guest!<br>");
			}else{
				out.print("Welcome,"+user+"!<br>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new JspException("Error in WelcomeTag.doTag()");
		}
	}
}
