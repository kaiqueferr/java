package atividade_poo;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(123,"Pedro","Avenida Dom Pedro I",3,true);
		
		Cliente c2 = new PessoasFisica(124,"Julia","Avenida Dos Estados",4,true,"1/3" ,"123.321" );
		
		Cliente c3 = new PessoaJuridica(125,"Gaby","Avenida 9 de Julho",5,true, "2006" ,"123.321/04");
		
		c1.visualizar();
		
		c2.visualizar();
		
		c3.visualizar();

	}

}
