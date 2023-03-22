package atividade_vetor_1;

import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int n, local = 0, flag = 0;
		
		System.out.printf("Digite o número que você deseja encontrar:");
		n = leia.nextInt();
		
		for(int i = 0; i < vetor.length; i++)
		{
			if(vetor[i] == n)
			{
				flag = 1;
				local = i;
			}
		}
		
		if(flag == 1)
		{
			System.out.printf("O número 7 está localizado na posição: %d", local);
		}
		else
		{
			System.out.printf("Não ha");
		}
	}

}
