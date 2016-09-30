

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletTable
 */
public class ServletTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<!DOCTYPE html>");
		pw.println("<head>");
		
		pw.println("<script>");
		
		pw.println("table, th, td { border: 1px solid black;}");

		
		pw.println("</script>");
		
		pw.println("<title>");
		pw.println("Hello Servlet");
		pw.println("</title>");
		pw.println("<meta charset=\"UTF-8\">");
		pw.println("</head>");
		pw.println("<body>");
		
		pw.println("<table style=\"width:100%\">");
		pw.println("<tr>");
		pw.println("<th>Firstname</th>");
		pw.println("<th>Lastname</th>");
		pw.println("<th>Age</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Jill</td>");
		pw.println("<td>Smith</td>");
		pw.println("<td>50</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Eve</td>");
		pw.println("<td>Jackson</td>");
		pw.println("<td>94</td>");
		pw.println("</tr>");
		pw.println("</table>");
		
		
		pw.println("</body>");
		pw.println("</html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
