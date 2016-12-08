package com.songjuan.servlet;

import DB.DruidDB;
import com.songjuan.java.Product;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataSource dataSource;
	
	public void init() {
		
		try{
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/sampleDS");
		}catch(NamingException ne){
			System.out.println("Exception:"+ne);
		} 
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<Product> prodList = null;
		prodList = new ArrayList<Product>();
		try{
			Connection dbconn = DruidDB.getConnection();
			String sql = "SELECT * FROM products";
			PreparedStatement pstmt = dbconn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			while(result.next()){
				Product product = new Product();
				product.setProd_id(result.getString("prod_id"));
				product.setPname(result.getString("pname"));
				product.setPrice(result.getDouble("price"));
				product.setStock(result.getInt("stock"));
				prodList.add(product);
				
			}
			if(!prodList.isEmpty()){
				request.getSession().setAttribute("prodList", prodList);
				response.sendRedirect("showProduct.jsp");
			}else{
				response.sendRedirect("error.jsp");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void destroy() {
		try{
			Connection dbconn = DruidDB.getConnection();
			dbconn.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	

}

