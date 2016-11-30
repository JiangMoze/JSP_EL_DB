package TouPiao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet(name="EL",urlPatterns={"/servlet/El"})
public class El extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		File f=new File("D:/","1.txt");
		File f1=new File("D:/","2.txt");
		File f2=new File("D:/","3.txt");
		FileInputStream fi1=new FileInputStream(f);
		FileInputStream fi2=new FileInputStream(f1);
		FileInputStream fi3=new FileInputStream(f2);
		int a[]=new int[10];
		int c[]=new int [10];
		
		while((a[0]=fi1.read())!=-1){
			c[0]=a[0];
		}
		while((a[1]=fi2.read())!=-1){
			c[1]=a[1];
		}
		while((a[2]=fi3.read())!=-1){
			c[2]=a[2];
		}
		System.out.print(c[2]);
		request.setAttribute("c0",c[0]-48 );
		request.setAttribute("c1", c[1]-48);
		request.setAttribute("c2", c[2]-48);

RequestDispatcher rd=request.getRequestDispatcher("/voteResult.jsp");

rd.forward(request, response);
			
		}
		
		
	}


