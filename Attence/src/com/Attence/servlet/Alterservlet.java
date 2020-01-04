package com.Attence.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Attence.entity.ATTENCE;
import com.Attence.service.ATTENCEservice;
import com.Attence.service.Impl.ATTENCEserviceImpl;

public class Alterservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String EMPNAME = req.getParameter("EMPNAME");
		
		String DEPT = req.getParameter("DEPT");
		
		String CHKDATE = req.getParameter("CHKDATE");
		
		int STATUS = Integer.parseInt(req.getParameter("STATUS"));
		
		int ID = Integer.parseInt(req.getSession().getAttribute("ID").toString());
		
		PrintWriter out = resp.getWriter();
		ATTENCEservice service = new ATTENCEserviceImpl();
		ATTENCE attence = new ATTENCE();
		attence.setEMPNAME(EMPNAME);
		attence.setDEPT(DEPT);
		attence.setCHKDATE(CHKDATE);
		attence.setSTATUS(STATUS);
		attence.setID(ID);
		int rows = service.getmodification(attence);
		if (rows > 0) {
			out.print("修改成功");
			resp.sendRedirect("GB");
		}else {
			out.print("修改失败");
			resp.sendRedirect("alter.jsp");
		}
	}

	
	
}
