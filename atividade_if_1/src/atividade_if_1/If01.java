package atividade_if_1;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.printf("Digite o número A:");
		n1 = leia.nextInt();
		System.out.printf("Digite o número A:");
		n2 = leia.nextInt();
		System.out.printf("Digite o número A:");
		n3 = leia.nextInt();
		
		if((n1+n2)>n3) System.out.printf("A soma de %d + %d é Maior que %d", n1,n2,n3);
		else if((n1+n2)<n3) System.out.printf("A soma de %d + %d é Menor que %d", n1,n2,n3);
		else System.out.printf("A soma de %d + %d é Igual a %d", n1,n2,n3);

	}

}
