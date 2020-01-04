package sInvestigateServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sInvestigateEntity.sInvestigate;
import sInvestigateService.sInvestigateInterfaceService;
import sInvestigateServiceImpl.sInvestigateInterfaceServiceImpl;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {


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
		sInvestigateInterfaceService service = new sInvestigateInterfaceServiceImpl();
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String opinion = request.getParameter("opinion");
		String time = request.getParameter("time");
		String $default = request.getParameter("default");
		String takeOne = request.getParameter("takeOne");
		String remark = request.getParameter("remark");
		String no = request.getParameter("no");
		String num = request.getParameter("num");
		String takeTwo = request.getParameter("takeTwo");
		sInvestigate si = new sInvestigate();
		si.setId(id);
		si.setName(name);
		si.setOption(opinion);
		si.setTime(time);
		si.setViolatFlag($default);
		si.setViolateCesc(takeOne);
		si.setRemark(remark);
		si.setAppNo(no);
		si.setPrioCode(num);
		si.setKeyconsFile(takeTwo);
		int result = service.updateShow(si);
		if(result>0) {
			out.print("yes");
		}else {
			out.print("no");
		}
	}
}
