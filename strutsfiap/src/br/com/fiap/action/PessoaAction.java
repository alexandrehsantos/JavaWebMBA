package br.com.fiap.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.fiap.bean.Pessoa;

@Namespace("/pessoa")
public class PessoaAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3869097584903990535L;
	private Pessoa pessoaBean;
	private String mensagem; 
	
	@Action(value = "cadastrar", results = {
			@Result(name="success", location="/sucesso.jsp")
	})
	public String excute() throws Exception{
		System.out.println(this.pessoaBean);
		this.mensagem = "Tudo ok no cadastro";
		return SUCCESS;
	}

	public Pessoa getPessoaBean() {
		return pessoaBean;
	}

	public void setPessoaBean(Pessoa pessoaBean) {
		this.pessoaBean = pessoaBean;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
}
