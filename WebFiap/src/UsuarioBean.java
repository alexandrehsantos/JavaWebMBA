
public class UsuarioBean {
	private String nome;

	
	public Boolean getAcesso(){
		if(nome.equals("Teste"))
		return true;
		
		return false;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
