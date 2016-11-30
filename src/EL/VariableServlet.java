package EL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/VariableServlet")
public class VariableServlet extends HttpServlet {

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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("attribute1", new Integer(100));
		HttpSession session=request.getSession();
		session.setAttribute("attribute2", "JAVA World");
		ServletContext application=getServletContext();
		application.setAttribute("attribute3", new java.util.Date());
		request.setAttribute("attribute4", "请求作用域");
		session.setAttribute("attribute4", "会话作用域");
		application.setAttribute("attribute4", "应用作用域");
		RequestDispatcher dispatcher =request.getRequestDispatcher("/variable.jsp");
				dispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	
	}

}
