package Regiao;

public class Regiao extends Territorio {

	public Regiao() {
		super();
	}
	
	public ZonaDeVendas novaZonaDeVendas(String nome) {
		return new ZonaDeVendas(nome);
	}
}
