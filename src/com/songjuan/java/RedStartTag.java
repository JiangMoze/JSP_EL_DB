package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class RedStartTag extends SimpleTagSupport {
	public void doTag()throws JspException,IOException{
		JspWriter out=getJspContext().getOut();
		out.print("<font color='#FF0000'>*</font>");
	}
}