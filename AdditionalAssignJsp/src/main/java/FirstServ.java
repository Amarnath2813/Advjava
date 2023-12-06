

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
 * Servlet implementation class FirstServ
 */
public class FirstServ extends HttpServlet {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> mylist=new ArrayList<>();
		PrintWriter pi = response.getWriter();
		PreparedStatement p=null;
		try {
			if(con!=null) {
				p=con.prepareStatement("Select pname from product");
				ResultSet resultset=p.executeQuery();
				while(resultset.next()) {
					String productname=resultset.getString("pname");
					mylist.add(productname);
					
				}
				request.setAttribute("mylist", mylist);
				request.getRequestDispatcher("/shop.jsp").forward(request, response);

				
				
			}
				else {
					pi.println("connection is not made");
				}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		pi.println(mylist);
		
	}

}
