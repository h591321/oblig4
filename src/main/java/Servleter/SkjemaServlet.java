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
import utils.LoginUtil;
import utils.PassordUtil;
import utils.SkjemaBean;



@WebServlet("/SkjemaServlet")

public class SkjemaServlet extends HttpServlet {

	@EJB
	private DeltagerDAO deltagerDAO;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/paameldingskjema.jsp").forward(request, response);
		}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SkjemaBean skjema = new SkjemaBean(request);
		
		if(skjema.allInputValid()) {
			String salt = PassordUtil.genererTilfeldigSalt();
			String hash = PassordUtil.hashMedSalt(skjema.getPassord(), salt);
			Deltager nyDeltager = new Deltager( skjema.getMobil(), skjema.getFornavn(), skjema.getEtternavn(), skjema.getKjonn(), hash, salt);
			deltagerDAO.lagreNyDeltager(nyDeltager);
			LoginUtil.logIn(request, skjema.getMobil());
			request.getSession().setAttribute("skjema", skjema);
			response.sendRedirect("BekreftelseServlet");
		}else {
			skjema.setupFeilMelding();
			
			request.getSession().setAttribute("skjema", skjema);
			response.sendRedirect("SkjemaServlet");
		}
		//stikk av ditt svin, du er for stygg for meg, og morra di er med på det værste
		
		
	}

}
