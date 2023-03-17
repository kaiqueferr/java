package atividade_do_5;

import java.util.Scanner;

public class Do05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n, soma = 0;
		do
		{
			System.out.printf("Digite uma idade:");
			n = leia.nextInt();
			
			if(n>0)soma += n;
			
		}while(n!=0);
		
		System.out.printf("A soma dos números positivos é: %d", soma);

	}

}
