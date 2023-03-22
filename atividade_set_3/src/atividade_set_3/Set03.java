package atividade_set_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> n = new HashSet<Integer>();
		
		System.out.printf("Entre com 10 numeros:\n");
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("%do:",i+1);
			n.add(leia.nextInt());
		}
		

		System.out.printf("\nListar dados do Set:\n");
		for(var ver : n)
		{
			System.out.printf("%d\n",ver);
		}

	}

}
