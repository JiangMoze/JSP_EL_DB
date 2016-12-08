package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class CaseTag extends SimpleTagSupport{
	private String caseValue;
	public void setCaseValue(String caseValue){
		this.caseValue = caseValue;
	}
	public void doTag() throws JspException,IOException{
		SwitchTag parent = (SwitchTag)getParent();
		String conditionValue = parent.getConditionValue();
		if(conditionValue.equals(caseValue)){
			parent.setCaseFound(true);
			getJspBody().invoke(null);
		}else{
			return;
		}
	}

}
