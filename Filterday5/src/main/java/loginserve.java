

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class loginserve
 */
public class loginserve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String name=request.getParameter("nm");
String age=request.getParameter("ag");
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<br>");
			pw.println("in side login servlet<br>");
			pw.println("<br>"+name+"    "+age);
		}
		catch(Exception ee)
		{
			System.out.println("in catch     "+ee);
		}
	}

}
