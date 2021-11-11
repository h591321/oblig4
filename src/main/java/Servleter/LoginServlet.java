package Servleter;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DeltagerDAO;
import utils.LoginUtil;
import utils.Validator;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@EJB
	private DeltagerDAO deltagerDAO;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/logginn.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String passord=request.getParameter("passord");
		String mobil=request.getParameter("mobil");
		
		if(Validator.isValidLogin(mobil,passord, deltagerDAO)) {
			LoginUtil.logIn(request, mobil);
			response.sendRedirect("DeltagerListeServlet");
		}else {
			response.sendRedirect("LoginServlet"+"?f2=Ugyldig brukernavn og/eller passord");
		}
		
	}

}
