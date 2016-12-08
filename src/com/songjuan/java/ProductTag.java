package com.songjuan.java;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.ArrayList;

public class ProductTag extends SimpleTagSupport {
	private ArrayList<Product>productList;
	public void setProductList(ArrayList<Product>productList){
		this.productList=productList;
	}
	public void doTag()throws JspException,IOException{
		for(Product product:productList){
			getJspContext().setAttribute("product",product);
			getJspBody().invoke(null);
		}
	}
}