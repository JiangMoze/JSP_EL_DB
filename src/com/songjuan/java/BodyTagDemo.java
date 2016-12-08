package com.songjuan.java;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class BodyTagDemo extends SimpleTagSupport{
	public void doTag() throws JspException,IOException{
		JspWriter out=getJspContext().getOut();

		out.print("<font color='red'>JSTLBefor<br></font><br/>");
		getJspBody().invoke(null);
		out.print("<font color='blue'>JSTLAfter<br></font><br/>");
	}
}
