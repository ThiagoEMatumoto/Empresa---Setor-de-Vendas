package Pessoa;

abstract class Pessoa {
	protected String nome;
	protected int telefone;
	
	public Pessoa(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
}
