package br.com.fiap.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class PopulaUsuarioFilter implements Filter {

	private FilterConfig filterConfig = null;

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) req;

		Cookie cookie = getUsuario(httpServletRequest);
		

		HttpSession session = httpServletRequest.getSession(true);

		chain.doFilter(req, resp);

	}

	private Cookie getUsuario(HttpServletRequest req) {

		Cookie[] cookies = req.getCookies();

		if (cookies == null)
			return null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("usuario.logado")) {
				return cookie;
			}
		}

		return null;
	}
}
