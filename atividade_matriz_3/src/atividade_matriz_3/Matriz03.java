package atividade_matriz_3;

import java.util.Scanner;

public class Matriz03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3;j++)
			{
				System.out.printf("Digite um número para [%d][%d]: ", i,j);
				matriz[i][j] = leia.nextInt();
			}
		}
		
		System.out.printf("Elementos da Diagonal Principal: ");
		for(int i= 0; i <3;i++)
		{
			System.out.printf("%d ",matriz[i][i]);
			somaPrincipal += matriz[i][i];
		}
		System.out.printf("\n");
		System.out.printf("Elementos da Diagonal Secundária: ");
		for(int i= 0; i <3;i++)
		{
			System.out.printf("%d ",matriz[i][2-i]);
			somaSecundaria += matriz[i][2-i];
		}
		System.out.printf("\n");
		System.out.printf("Soma dos Elementos da Diagonal Principal: %d\n",somaPrincipal);
		System.out.printf("Elementos da Diagonal Secundária: %d\n",somaSecundaria);

	}

}
