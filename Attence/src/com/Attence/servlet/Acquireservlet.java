package com.Attence.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Attence.entity.ATTENCE;
import com.Attence.service.ATTENCEservice;
import com.Attence.service.Impl.ATTENCEserviceImpl;

public class Acquireservlet extends HttpServlet {

	//获取id
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int ID = Integer.parseInt(req.getParameter("id"));
		
		ATTENCEservice service = new ATTENCEserviceImpl();
		ATTENCE attence = new ATTENCE();
		attence = service.transfer(ID);
		req.setAttribute("yu",attence);
		req.getSession().setAttribute("ID", ID);
		req.getRequestDispatcher("alter.jsp").forward(req, resp);
		
	}

}
