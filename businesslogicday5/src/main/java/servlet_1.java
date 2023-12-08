

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.Beanclass;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet_1
 */
public class servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Welcome to CallPojoServ");
		pw.println("<br>"); // generating html dynamically
		Beanclass ref=new Beanclass();
		pw.println(ref.disp1());
		
	}

}
