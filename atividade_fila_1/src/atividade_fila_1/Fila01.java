package atividade_fila_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila01 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int n;
		
		do
		{
			System.out.printf("1 - Add Cliente.\n");
			System.out.printf("2 - Todos Clientes.\n");
			System.out.printf("3 - Retirar Cliente.\n");
			System.out.printf("0 - Sair.\n");
			System.out.printf("Digite uma opção_:");
			n =leia.nextInt();
			
			if (leia.hasNextLine()) {
	            leia.nextLine();
	        }

			switch (n) {

			case 1:
				System.out.printf("Digite o nome:\n");
				fila.add(leia.next());
				System.out.printf("\nLista:\n");
				for(var nomes : fila)
				{
					System.out.printf("%s\n",nomes);
				}
				System.out.printf("\n");
				
				break;
			case 2:
				System.out.printf("Lista de Clientes na Fila:\n");
				System.out.printf("\nLista:\n");
				for(var nomes : fila)
				{
					System.out.printf("%s\n",nomes);
				}
				System.out.printf("\n");
	
				break;
			case 3:
				System.out.printf("Fila:\n");
				fila.poll();
				System.out.printf("\nLista:\n");
				for(var nomes : fila)
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
