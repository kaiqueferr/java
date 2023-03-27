package atividade_poo_3;

import java.time.LocalDate;

public class Jogo extends Produto1{
	
	private String midia;

	public Jogo(int id, String nome, int versao, LocalDate dataLancamento, String produtora, float preco,
			String midia) {
		super(id, nome, versao, dataLancamento, produtora, preco);
		this.midia = midia;
	}
	
	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Midia : " + this.midia);
	}

}
