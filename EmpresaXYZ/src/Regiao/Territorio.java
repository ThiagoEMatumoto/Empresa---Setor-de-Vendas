package Regiao;
import java.util.Scanner;

import Pessoa.Vendedor;

abstract class Territorio {
	
	Scanner sc = new Scanner(System.in);
	protected String nome;
	protected String nomeVendedor;
	protected int telefoneVendedor;
	public Territorio() {
		System.out.print("Informe o nome da região: ");
		nome = sc.next();
		System.out.print("Informe o responsavel pela região: ");
		nomeVendedor = sc.next();
		System.out.print("Informe o numero do responsável: ");
		telefoneVendedor = sc.nextInt();
		new Vendedor(nomeVendedor, telefoneVendedor, this.nome);
	}
	
	public void setVendedorResponsavel(String vendedorResponsavel) {
		this.nomeVendedor = vendedorResponsavel;
	}
	public String getVendedorResponsavel() {
		return nomeVendedor;
	}
}
