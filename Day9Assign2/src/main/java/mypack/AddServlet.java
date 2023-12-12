package mypack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDAO sdao;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String persistencestore=request.getParameter("persistencestore");
	Student student = new Student();
	student.setName(name);
	student.setAddress(address);
	if("file".equalsIgnoreCase(persistencestore)) {
		sdao=new StudentDAOFileImpl();
		sdao.addStudent(student);
	}
	else if("database".equalsIgnoreCase(persistencestore)) {
		sdao=new StudentDAODataImpl();
		sdao.addStudent(student);
	}
	response.getWriter().println("Student added succesfull");
		
	}

}
