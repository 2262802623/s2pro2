package com.Attence.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Attence.entity.ATTENCE;
import com.Attence.service.ATTENCEservice;
import com.Attence.service.Impl.ATTENCEserviceImpl;

public class showservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		ATTENCEservice service = new ATTENCEserviceImpl();
		List<ATTENCE> list = service.getShow();
		req.setAttribute("list", list);
		req.getRequestDispatcher("show.jsp").forward(req, resp);
	}

	
	
}
