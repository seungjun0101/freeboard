package com.jcpdev.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jcpdev.dao.FreeboardDao;
import com.jcpdev.dto.Freeboard;

public class UpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int pageNo = Integer.parseInt(request.getParameter("page"));
		FreeboardDao dao = FreeboardDao.getInstance();
		Freeboard dto = dao.getOne(idx);
		
		request.setAttribute("page", pageNo);
		request.setAttribute("bean", dto);
	//	pageContext.forward("updateView.jsp");
		ActionForward forward = new ActionForward();
		forward.isRedirect = false;
		forward.url = "community/update.jsp";
		return forward;
	}

}
