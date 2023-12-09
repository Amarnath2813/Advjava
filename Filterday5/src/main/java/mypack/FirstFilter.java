package mypack;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.io.FileWriter;
import java.io.*;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class FirstFilter
 */
public class FirstFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FirstFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		String name=req.getParameter("nm");
		String age=req.getParameter("ag");
		FileWriter fw=new FileWriter("d:\\loginfile.txt");
		fw.write(name);
		fw.write(age);
		fw.close();
PrintWriter pw=res.getWriter();
pw.println("<br>Data saved in a file<br>");	
chain.doFilter(req,res);
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
