package atividade_poo_3;

import java.time.LocalDate;

public class Produto1 {
	
	private int id;
	private String nome;
	private int versao;
	private LocalDate dataLancamento;
	private String produtora;
	private float preco;
	
	public Produto1(int id, String nome, int versao, LocalDate dataLancamento, String produtora, float preco) {
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.dataLancamento = dataLancamento;
		this.produtora = produtora;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar()
	{
		System.out.println("***********************************************");
		System.out.println("               dados do produto                ");
		System.out.println("***********************************************");
		System.out.println("ID : " + this.id);
		System.out.println("Nome : " + this.nome);
		System.out.println("-V : " + this.versao );
		System.out.println("Lancado em:" + this.dataLancamento );
		System.out.println("Produtora : " + this.produtora);
		System.out.println("Preco : " + this.preco);
		
	}

}
