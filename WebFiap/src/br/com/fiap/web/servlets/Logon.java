package br.com.fiap.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.UsuarioBean;

public class Logon extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		String nome = req.getParameter("nome");
		
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setNome("Teste");
		
		if(!usuarioBean.getAcesso()){	
			writer.println("<html><body>Usuário Invalido</body></html>");
		} else {
			Cookie cookie = new Cookie("usuario.logado", nome);
			resp.addCookie(cookie);
			writer.println("<html><body> Usuario Logado"+ nome + "</body></html>");
			
		}
		
			
	}
	
}
