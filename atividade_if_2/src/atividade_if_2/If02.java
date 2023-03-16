package atividade_if_2;

import java.util.Scanner;

public class If02 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1;
		
		System.out.printf("Digite um número:");
		n1 = leia.nextInt();
		
		if(n1%2==0 && n1>0)System.out.printf("O Número %d é par e positivo!",n1);
		if(n1%2!=0 && n1>0)System.out.printf("O Número %d é impat e positivo!",n1);
		if(n1%2==0 && n1<0)System.out.printf("O Número %d é par e negativo!",n1);
		if(n1%2!=0 && n1<0)System.out.printf("O Número %d é impar e negativo!",n1);

	}

}
