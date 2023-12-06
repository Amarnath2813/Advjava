

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class StudentServ
 */
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bit";
		
			con=DriverManager.getConnection(url,"root","Amar@1234");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Integer> li= new ArrayList<>();
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address=request.getParameter("address");
		PreparedStatement p;
		PreparedStatement p1;
		try {
			
			p = con.prepareStatement("insert into student values(?,?,?,?)");
			p.setInt(1, rollno);
			p.setString(2, name);
			p.setInt(3, age);
			p.setString(4, address);
		
		
		
		boolean r=p.execute();
		PrintWriter pw= response.getWriter();
		
		
	
		p1=con.prepareStatement("select rollno from student");
		ResultSet resultset=p1.executeQuery();
		while(resultset.next()) {
			int rollnos=resultset.getInt("rollno");
			li.add(rollnos);
		}
		
		request.setAttribute("li",li);
		request.getRequestDispatcher("Report.jsp").forward(request, response);
		pw.println(li);
	
		}
		
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

		
	}

}
