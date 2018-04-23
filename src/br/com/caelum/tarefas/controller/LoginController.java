package br.com.caelum.tarefas.controller;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.UsuarioDao;
import br.com.caelum.tarefas.modelo.Usuario;

@Controller
@Transactional
public class LoginController {
	
	@Autowired
	@Qualifier("jdbcUsuarioDao")
	private UsuarioDao dao;

	@RequestMapping("loginForm")
	public String loginForm() {
		return "formulario-login";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if (dao.existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "/index";
		} else {
			return "redirect:loginForm?erro=Usuario ou senha invalidos";
		}
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect: loginForm";
	}
	
}