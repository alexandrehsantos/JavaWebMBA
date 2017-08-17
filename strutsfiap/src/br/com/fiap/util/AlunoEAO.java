package br.com.fiap.util;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Aluno;

public class AlunoEAO {
	private List<Aluno> pessoaList;

	public List<Aluno> getListPessoa() {

		return getPessoaList();

	}

	public void incluirPessoa(Aluno aluno) {
		setPessoaList(new ArrayList<Aluno>());

		getPessoaList().add(aluno);

	}

	public List<Aluno> getPessoaList() {
		return pessoaList;
	}

	public void setPessoaList(List<Aluno> pessoaList) {
		this.pessoaList = pessoaList;
	}

}
