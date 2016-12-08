package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class MarkerTag extends SimpleTagSupport{
	private String search=null;
	public void setSearch(String search){
		this.search=search;
	}
	public void doTag() throws JspException,IOException{
		JspWriter out=getJspContext().getOut();
		StringWriter sw=new StringWriter();
		getJspBody().invoke(sw);
		String text=sw.toString();
		int len=search.length();
		int oldIndex=0,newIndex=0;
		while((newIndex=text.indexOf(search, oldIndex))>=0){
			if(newIndex<oldIndex){
				break;
			}
			out.print(text.substring(oldIndex, newIndex));
			out.print("<b><font color='blue' size='15'>"+search+"</font></b>");
			oldIndex=newIndex+len;
		}
		out.print(text.substring(oldIndex));
	}
}
