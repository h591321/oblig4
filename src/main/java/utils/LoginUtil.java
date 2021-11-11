package utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class LoginUtil {

	public static void logIn(HttpServletRequest request, String mobil) {
		logOut(request);
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(45);
		session.setAttribute("mobil", mobil);

	}

	public static boolean erInnlogget(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return session != null && session.getAttribute("mobil") != null;
	}

	public static void logOut(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
	}
}