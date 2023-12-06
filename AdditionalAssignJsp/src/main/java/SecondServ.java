

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class SecondServ
 */
public class SecondServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> selectedproductlist= new ArrayList<>();
		String[] str=request.getParameterValues("selectedproductname");
		for(String product:str) {
			selectedproductlist.add(product);
		}
		HttpSession s=request.getSession();
		s.setAttribute("selectedproductlist",selectedproductlist);
		response.sendRedirect("Bill.jsp");
		
	}

}
