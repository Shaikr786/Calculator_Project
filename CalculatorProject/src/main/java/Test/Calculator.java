package Test;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Calculator extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		try {
		out.println("<center>");
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c=0;
		String str = null;
		str=request.getParameter("btn");
		if(str.equals("+"))c=a+b;
		if(str.equals("-"))c=a-b;
		if(str.equals("*"))c=a*b;
		if(str.equals("/"))c=a/b;
		out.println("<h1>Result is "+ c +"</h1>");
		
		}catch(Exception e) {
			out.println("Error: "+e.getMessage());
			
		}

		finally {
			out.println("<br>");
		
			
		}
		
	
	}

}
