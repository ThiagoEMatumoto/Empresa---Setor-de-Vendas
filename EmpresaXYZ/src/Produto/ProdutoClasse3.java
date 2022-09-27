package Produto;

public class ProdutoClasse3 extends Produto {

	public ProdutoClasse3(String nome, Float preco) {
		super(nome, preco);
	}

	@Override
	public Float getPorcentagemComissao() {
		this.porcentagemComissao = (float) 0.15;
		return this.porcentagemComissao;
	}

}
