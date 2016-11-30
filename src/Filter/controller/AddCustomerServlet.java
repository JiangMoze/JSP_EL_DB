package Filter.controller;

import Filter.DAO.CustomerDao;
import Filter.vo.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2016/11/20.
 */
@WebServlet(name = "AddCustomerServlet",urlPatterns = {"/addCustomer.do"})
public class AddCustomerServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao dao=new CustomerDao();
		Customer customer=new Customer();
		String message=null;
		try{
			customer.setCust_id(request.getParameter("cust_id"));
			customer.setCname(new String(request.getParameter("cname").getBytes("iso-8859-1"),"UTF-8"));
			customer.setEmail(new String(request.getParameter("email").getBytes("iso-8859-1"),"UTF-8"));
			customer.setBalance(Double.parseDouble(request.getParameter("balance")));
			boolean success=dao.addCustomer(customer);
			System.out.println(success);
			if(success){
				message="<li>成功插入一条记录！</li>";
			}else{
				message="<li>插入记录错误</li>";
			}
		}catch (Exception e){
			message="<li>插入记录错误1</li>";
		}
		request.setAttribute("result",message);

		RequestDispatcher rd=request.getRequestDispatcher("/addCustomer.jsp");
		rd.forward(request,response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}
}
