package Servleter;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Deltager;
import database.DeltagerDAO;
import utils.SkjemaBean;



@WebServlet("/SkjemaServlet")

public class SkjemaServlet extends HttpServlet {

	@EJB
	private DeltagerDAO deltagerDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/paameldingskjema.jsp").forward(request, response);
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SkjemaBean skjema = new SkjemaBean(request);
		
		if(skjema.allInputValid()) {
			Deltager nyDeltager = new Deltager(skjema.getFornavn(), skjema.getEtternavn(), skjema.getMobil(), skjema.getKjonn(), skjema.getPassord());
			deltagerDAO.lagreNyDeltager(nyDeltager);
			request.getSession().setAttribute("skjema", skjema);
			response.sendRedirect("BekreftelseServlet");
		}else {
			skjema.setupFeilMelding();
			
			request.getSession().setAttribute("skjema", skjema);
			response.sendRedirect("SkjemaServlet");
		}
		
		
		
	}

}
