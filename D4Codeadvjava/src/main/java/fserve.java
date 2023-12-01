import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.SingletonCon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/fserve")
public class fserve extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Connection con;

    public void init() {
        try {
            con = SingletonCon.getCon();
            System.out.println("Connection inited"); // Debug print
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            pw.println("Using properties");
            pw.println("<br>");

            System.out.println("Before executing query"); // Debug print

            try (Statement st = con.createStatement()) {
                ResultSet rs = st.executeQuery("select * from dept");

                System.out.println("Query executed"); // Debug print

                while (rs.next()) {
                    pw.println(rs.getInt(1));
                    pw.println(rs.getString(2));
                    pw.println(rs.getString(3));
                }
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}
