package ativida_list_01;

import java.util.ArrayList;
import java.util.Scanner;

public class List01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cor = new ArrayList<String>();
		
		System.out.printf("Entre com 5 cores:\n");
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("%do:",i+1);
			cor.add(leia.nextLine());
		}
		

		System.out.printf("\nListar todas as cores:\n");
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("%s\n",cor.get(i));
		}
		
		
		cor.sort(null);
		System.out.printf("\nOrdenar as cores:\n");
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("%s\n",cor.get(i));
		}
		
		
		
		

	}

}
