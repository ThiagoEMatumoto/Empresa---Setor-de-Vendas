package Produto;

abstract class Produto {
	protected String nome;
	protected Float preco;
	protected Float porcentagemComissao;
	
	public Produto(String nome, Float preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public abstract Float getPorcentagemComissao();

}
