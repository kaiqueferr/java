package atividade_suitch_5;

import java.util.Scanner;

public class Switch05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo, quantidade, valor;
		String produto;
		float total;
		
		System.out.printf("Código do Produto:");
		codigo = leia.nextInt();
		System.out.printf("Quantidade:");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		  case 1:
			  valor = 10;
			  produto = "Cachorro Quente";
		    break;
		  case 2:
			  valor = 15;
			  produto = "X-Salada";
		    break;
		  case 3:
			  valor = 18;
			  produto = "X-Bacon";
		    break;
		  case 4:
			  valor = 12;
			  produto = "Bauru";
		    break;
		  case 5:
			  valor = 8;
			  produto = "Refrigerante";
		    break;
		  case 6:
			  valor = 13;
			  produto = "Suco de laranja";
		break;
		  default:
			  valor = 0;
			  produto = "Produto invalido";
		}
		total = valor*quantidade;
		System.out.printf("Produto: %s\n", produto);
		System.out.printf("Valor total: R$%.2f",total );

	}

}
