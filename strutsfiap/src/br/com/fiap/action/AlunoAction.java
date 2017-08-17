package br.com.fiap.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.fiap.bean.Aluno;
import br.com.fiap.util.AlunoEAO;

public class AlunoAction extends ActionSupport {

	private String mensagem;
	private AlunoEAO alunoEAO;
	private Aluno aluno;
	
	
	@Action(value="cadastraraluno", results = {
			@Result(name="success", location="/sucesso.jsp")
	})
	public String execute() throws Exception {
		this.setMensagem("cadastro realizado com sucesso");
		return SUCCESS;
	}

	public void cadastrar(){
		alunoEAO.incluirPessoa(getAluno());
	}
	
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public AlunoEAO getAlunoEAO() {
		return alunoEAO;
	}

	public void setAlunoEAO(AlunoEAO alunoEAO) {
		this.alunoEAO = alunoEAO;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
