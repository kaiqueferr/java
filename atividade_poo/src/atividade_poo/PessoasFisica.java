package atividade_poo;

public class PessoasFisica extends Cliente {
	
	String cpf;
	String dataNascimento;

	public PessoasFisica(int registro, String nome, String endereco, int compras, boolean vantagens, String dataNascimento, String cpf) {
		super(registro, nome, endereco, compras, vantagens);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF : " + this.cpf);
		System.out.println("Nascimento : " + this.dataNascimento);
	}

}
