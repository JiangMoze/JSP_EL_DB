package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class LoopTag extends SimpleTagSupport
{
	private int count =0;
	public void setCount(int count)
	{
		this.count = count;
	}
	public void doTag() throws JspException,IOException
	{

		JspWriter out  = getJspContext().getOut();
		StringWriter sw =  new StringWriter();
		getJspBody().invoke(sw);
		String text = sw.toString();
		for(int i = 0 ; i <=  count ;i++)
		{
			out.println("<h "+i +" >"+text + "</h" + i +">");
		}
	}
}
