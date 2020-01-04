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

public class ADDservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ATTENCEservice service = new ATTENCEserviceImpl();
		
		ATTENCE attence = new ATTENCE();
		
		String EMPNAME = req.getParameter("EMPNAME");
		
		String DEPT = req.getParameter("DEPT");
		
		String CHKDATE = req.getParameter("CHKDATE");
		PrintWriter out = resp.getWriter();
		int STATUS = 0;
		if (req.getParameter("STATUS") != null) {
			STATUS = Integer.parseInt(req.getParameter("STATUS"));
		}
		req.setAttribute("STATUS", STATUS);
		attence.setEMPNAME(EMPNAME);
		attence.setDEPT(DEPT);
		attence.setCHKDATE(CHKDATE);
		attence.setSTATUS(STATUS);
		int rows = service.getadd(attence);
		if (rows > 0) {
			out.print("添加成功");
			resp.sendRedirect("GB");
		}else {
			out.print("添加失败");
			resp.sendRedirect("ADD.jsp");
		}
	}

	
	
}
