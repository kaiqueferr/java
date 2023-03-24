package atividade_poo;

public class Cliente {
	
	String nome;
	String cpf;
	String dataNascimento;
	String endereco;
	int compras;
	
	public Cliente(String nome, String cpf, String dataNascimento, String endereco, int compras) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.compras = compras;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCompras() {
		return compras;
	}
	public void setCompras(int compras) {
		this.compras = compras;
	}
	
	public void visualizar()
	{
		System.out.println("***********************************************");
		System.out.println("               dados do cliente                ");
		System.out.println("***********************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf );
		System.out.println("Nascimento :" + this.dataNascimento);
		System.out.println("Endereco :" + this.endereco );
		System.out.println("No Compras : " + this.compras );

		
	}
	
	
	
	
}
