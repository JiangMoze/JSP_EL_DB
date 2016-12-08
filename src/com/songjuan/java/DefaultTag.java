package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class DefaultTag extends SimpleTagSupport{
	public void doTag() throws JspException,IOException{
		SwitchTag parent = (SwitchTag)getParent();
		if(parent.getCaseFound()){
			return;
		}else{
			getJspBody().invoke(null);
		}
	}
}

