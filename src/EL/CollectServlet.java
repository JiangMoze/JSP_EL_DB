package EL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet("/CollectServlet")
public class CollectServlet extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		ArrayList<String> country=new ArrayList<String>();
		country.add("China");
		country.add("England");
		country.add("Russia");
		HashMap<String, String> captial=new HashMap<String, String>();
		captial.put("China", "北京");
		captial.put("England", "英国");
		captial.put("Russia", "莫斯科");
		request.setAttribute("country", country);
		request.setAttribute("captial", captial);
		RequestDispatcher rd=request.getRequestDispatcher("/Collections.jsp");
		rd.forward(request, response);
		
	}

}
