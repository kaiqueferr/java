package atividade_poo;

public class PessoaJuridica extends Cliente{
	
	String cnpj;
	String anoFundacao;

	public PessoaJuridica(int registro, String nome, String endereco, int compras, boolean vantagens, String anoFundacao, String cnpj) {
		super(registro, nome, endereco, compras, vantagens);
		this.cnpj = cnpj;
		this.anoFundacao = anoFundacao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ : " + this.cnpj);
		System.out.println("Fundacao : " + this.anoFundacao);
	}
	
	

}
