package atividade_poo;

public class Cliente {
	
	int registro;
	String nome;
	String endereco;
	int compras;
	boolean vantagens;
	
	public Cliente(int registro,String nome, String endereco, int compras, boolean vantagens) {
		this.registro = registro;
		this.nome = nome;
		this.endereco = endereco;
		this.compras = compras;
		this.vantagens = vantagens;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		System.out.println("Registro:" + this.registro );
		System.out.println("Vantagens : " + this.vantagens );
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereco :" + this.endereco );
		System.out.println("No Compras : " + this.compras );

		
	}
	
	
	
	
}
