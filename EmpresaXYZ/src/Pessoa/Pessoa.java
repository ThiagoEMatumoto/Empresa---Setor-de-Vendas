package Pessoa;

abstract class Pessoa {
	protected String nome;
	protected int telefone;
	protected String zona;
	
	public Pessoa(String nome, int telefone, String zona) {
		this.nome = nome;
		this.telefone = telefone;
		this.zona = zona;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getTelefone() {
		return telefone;
	}
	
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getZona() {
		return zona;
	}
	
}
