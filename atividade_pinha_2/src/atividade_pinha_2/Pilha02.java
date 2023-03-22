package atividade_pinha_2;

import java.util.Scanner;
import java.util.Stack;

public class Pilha02 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		
		int n;
		do
		{
			System.out.printf("1 - Add Livro.\n");
			System.out.printf("2 - Todos Livros.\n");
			System.out.printf("3 - Retirar Livro.\n");
			System.out.printf("0 - Sair.\n");
			System.out.printf("Digite uma opção_:");
			n =leia.nextInt();
			
			if (leia.hasNextLine()) {
	            leia.nextLine();
	        }

			switch (n) {

			case 1:
				System.out.printf("Digite o nome do livro:\n");
				pilha.push(leia.next());
				System.out.printf("\nLista:\n");
				for(var nomes : pilha)
				{
					System.out.printf("%s\n",nomes);
				}
				System.out.printf("\n");
				
				break;
			case 2:
				System.out.printf("Lista de livro na pilha:\n");
				System.out.printf("\nLista:\n");
				for(var nomes : pilha)
				{
					System.out.printf("%s\n",nomes);
				}
				System.out.printf("\n");
	
				break;
			case 3:
				System.out.printf("pilha:\n");
				pilha.pop();
				System.out.printf("\nLista:\n");
				for(var nomes : pilha)
				{
					System.out.printf("%s\n",nomes);
				}
				System.out.printf("\n");
				break;
			case 0:
				System.out.printf("Programa Finalizado!");
				break;
			default:
				if(n> 4)
					System.out.println("Opção inválida!");
			}
			
			
			
		}while(n != 0);
		

	}

}
