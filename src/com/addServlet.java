package AttenceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AttenceEntity.Attence;
import AttenceService.AttenceInterfaceService;
import AttenceServiceImpl.AttenceInterfaceServiceImpl;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {

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
		AttenceInterfaceService service = new AttenceInterfaceServiceImpl();
		PrintWriter out = response.getWriter();
		Attence at = new Attence();
		String name = request.getParameter("name");
		String department =  request.getParameter("department");
		String time = request.getParameter("time");
		int status = Integer.parseInt(request.getParameter("status"));
		at.setName(name);
		at.setDept(department);
		at.setChkdate(time);
		at.setStatus(status);
		int result = service.AddEmp(at);
		if(result>0) {
			out.print("yes");
		}else {
			out.print("no");
		}
	}

}
