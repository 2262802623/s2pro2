package promafServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import promafService.MafrptInterfaceService;
import promafServiceImpl.MafrptInterfaceServiceImpl;

/**
 * Servlet implementation class delServlet
 */
@WebServlet("/delServlet")
public class delServlet extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MafrptInterfaceService service = new MafrptInterfaceServiceImpl();
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		int result = service.delShow(id);
		if(result>0) {
			out.print("yes");
		}else {
			out.print("no");
		}
	}

}
