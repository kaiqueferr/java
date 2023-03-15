package atividade_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade04 {
	
public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,###,##0.00");
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, calculo;
		
		System.out.println("Numero1:");
		n1 = sc.nextFloat();
		System.out.println("Numero2:");
		n2 = sc.nextFloat();
		System.out.println("Numero3:");
		n3 = sc.nextFloat();
		System.out.println("Numero4:");
		n4 = sc.nextFloat();

		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.println("Diferenca: "+ df.format(calculo));
		
	}

}
