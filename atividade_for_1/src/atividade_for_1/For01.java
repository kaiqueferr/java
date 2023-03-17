package atividade_for_1;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número do intervalo:");
		a = leia.nextInt();
		System.out.printf("Digite o último número do intervalo:");
		b = leia.nextInt();
		
		if(a>b)
		{
			System.out.println("Intervalo inválido!");
		}
		else
		{
			for(int i = a; i <= b; i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
		}

	}

}
