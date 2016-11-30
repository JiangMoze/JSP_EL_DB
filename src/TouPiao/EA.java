package TouPiao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet/EA"})
public class EA extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String addr=request.getRemoteAddr();
		Cookie c[]=request.getCookies();
		Cookie c1=new Cookie("addr",addr);
		c1.setMaxAge(60*60*24);
		response.addCookie(c1);

		int d=0;

		for(int i=0;i<c.length;i++){
			if(c[i].getValue().equals(addr)){
				d=1;
				break;
			}else{
				d=0;
			}

		}
		if(d==0){								
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			String s=request.getParameter("c");				
			if(s.equals("1")){
				this.writeFile(request, response, 1);						
			}else if(s.equals("2")){
				this.writeFile(request, response, 2);							
			}else if(s.equals("3")){

				this.writeFile(request, response, 3);			
			}										
		}else if(d==1){
			RequestDispatcher rd=request.getRequestDispatcher("/servlet/El");					
			rd.forward(request, response);}		
	}
	public void writeFile(HttpServletRequest request, HttpServletResponse response,int a)
			throws ServletException, IOException {
		String s="0";
		int d=0;
		File f=new File("D:/",a+".txt");		
		if(!f.exists()){			
			try {
				f.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			FileOutputStream fid=new FileOutputStream(f);			
			byte br[]=new byte[1024];
			d=Integer.parseInt(s)+1;
			String e2=d+"";
			br=e2.getBytes();
			try {
				fid.write(br,0,br.length);
				fid.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}			
		}else if(f.exists()){			
			FileInputStream fi=new FileInputStream(f);
			InputStreamReader ins=new 	InputStreamReader(fi);
			int ch=0;
			int df=0;
			while((ch=ins.read())!=-1){
				df=ch;
			}	
			d=++df;
			d=d-48;	
			String e2=d+"";

			FileOutputStream fid=new FileOutputStream(f);

			byte br[]=new byte[1024];

			br=e2.getBytes();

			try {
				fid.write(br,0,br.length);
				fid.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		RequestDispatcher rd=request.getRequestDispatcher("/servlet/El");

		rd.forward(request, response);	}

}
