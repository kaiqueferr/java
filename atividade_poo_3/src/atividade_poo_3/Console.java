package atividade_poo_3;

import java.time.LocalDate;

public class Console extends Produto1 {
	
	private String menoria;

	public Console(int id, String nome, int versao, LocalDate dataLancamento, String produtora, float preco,
			String menoria) {
		super(id, nome, versao, dataLancamento, produtora, preco);
		this.menoria = menoria;
	}

	public String getMenoria() {
		return menoria;
	}

	public void setMenoria(String menoria) {
		this.menoria = menoria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Memoria : " + this.menoria);
	}

}
