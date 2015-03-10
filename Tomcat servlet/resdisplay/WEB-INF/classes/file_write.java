import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class file_write extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		response.setIntHeader("Refresh", 1);
		PrintWriter out = response.getWriter();
		String filename = "/WEB-INF/CPU.txt";
		ServletContext context = getServletContext();
		InputStream is = context.getResourceAsStream(filename);
		if(is != null)
		{
			out.print("<h1>Resource Display"+"</h1>");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			String text = "";
			out.print("<br>");
			//out.print("<script src='/WEB-INF/clear.js'></script>");
			if((text = reader.readLine()) != null)
			{
				//out.print("<del>"+temp+"</del>");
				/*RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/clear.html");
				request.setAttribute("atr1",text);
				rd.include(request, response);*/
				out.print("CPU Usage:  "+"<textarea id='output' rows=1 cols=4>"+text+"</textarea>");
				//out.print("<input type='button' value='clear' onclick='javascript:eraseText()'/>");
			}
			
		}
		String cpufile = "/WEB-INF/RAM.txt";
		InputStream is1 = context.getResourceAsStream(cpufile);
		if(is1 != null)
		{
			InputStreamReader isr1 = new InputStreamReader(is1);
			BufferedReader reader1 = new BufferedReader(isr1);
			String text1 = "";
			out.print("<br>");
			if((text1 = reader1.readLine()) != null)
			{
				out.print("RAM Usage: "+"<textarea id='output1' rows=1 cols=4>"+text1+"</textarea>");
			}
		}
		out.print("<br>");
		out.print("<br>");
		out.print("<br>");
		out.print("<p1>NOTE: Every value displayed are percentages and not absolute."+"</p1>");
	}
}
		