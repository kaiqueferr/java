package atividade_while_3;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade>=0)
		{
			System.out.printf("Digite uma idade:");
			idade = leia.nextInt();
			
			if(idade < 21 && idade >= 0)menor21++;
			if(idade > 50)maior50++;
		}
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maior50);

	}

}
