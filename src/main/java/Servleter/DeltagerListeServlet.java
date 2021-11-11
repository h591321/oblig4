package Servleter;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Deltager;
import database.DeltagerDAO;
import utils.LoginUtil;


@WebServlet("/DeltagerListeServlet")
public class DeltagerListeServlet extends HttpServlet {

	@EJB
	private DeltagerDAO deltagerDAO;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (!LoginUtil.erInnlogget(request)) {
			response.sendRedirect("LoginServlet?f1=Det er kun registrerte deltagere som kan se deltagerlisten");
		}else {
			//hente database og omgjøre til attributter
			List<Deltager> deltagerListe = deltagerDAO.hentAlleDeltagere();
			request.setAttribute("deltagerListe", deltagerListe);
			
			request.getRequestDispatcher("WEB-INF/jsp/deltagerliste.jsp").forward(request, response);
		}
	}
}
