package br.com.fiap.web.bean;

import java.util.Date;

public class AcessoBean {
	private Date primeiroAcesso; 
	private Date ultimoAcesso;
	
	
	public Date getPrimeiroAcesso() {
		return primeiroAcesso;
	}
	public void setPrimeiroAcesso(Date primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}
	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	
}
