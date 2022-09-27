package Produto;

public class ProdutoClasse2 extends Produto {

	public ProdutoClasse2(String nome, Float preco) {
		super(nome, preco);
	}

	@Override
	public Float getPorcentagemComissao() {
		this.porcentagemComissao = (float) 0.1 * this.preco;
		return this.porcentagemComissao;
	}

}
