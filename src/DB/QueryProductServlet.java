package DB;

import sun.security.pkcs11.Secmod;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="QueryProduct",urlPatterns={"/queryproduct.do"})
public class QueryProductServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productid=request.getParameter("productid");
		Product product=new displayDao().diplay(productid);
		if(product!=null){
			request.getSession().setAttribute("product", product);
			response.sendRedirect("displayProduct.jsp");
		}else{
			response.sendRedirect("error.jsp");
		}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		ArrayList<Product> productList=null;
		productList=new displayDao().displayAll();
			if(!productList.isEmpty()){
				request.getSession().setAttribute("productList", productList);
				response.sendRedirect("displayAllProduct.jsp");
			}else{
				response.sendRedirect("error.jsp");
			}
	}
}

