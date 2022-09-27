package Produto;

public class ProdutoClasse1 extends Produto {

	
	public ProdutoClasse1(String nome, Float preco) {
		super(nome, preco);
	}

	@Override
	public Float getPorcentagemComissao() {
		this.porcentagemComissao = (float) 0.05 * this.preco;
		return this.porcentagemComissao;
	}


}
