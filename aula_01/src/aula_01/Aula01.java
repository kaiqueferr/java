package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		
		String nome;
		
		System.out.printf("nome:");
		nome = leia.nextLine();
		System.out.println("1o :");
		numero1 = leia.nextDouble();
		System.out.println("2o :");
		numero2 = leia.nextDouble();
		
		System.out.printf("Vc digitou %f e %f.\n", numero1, numero2);
		System.out.printf("A soma e %f\n", numero1 + numero2);
		System.out.printf("A sub e %f\n", numero1 - numero2);
		System.out.printf("A mult e %f\n", numero1 * numero2);
		System.out.printf("A divi e %.2f\n", numero1 / numero2);
		System.out.println(df.format(numero1 / numero2) );
		System.out.println(df.format(Math.pow(numero1, numero2)) );
		System.out.println(df.format(Math.sqrt(numero1)) );
		
		System.out.println("Nome: " + nome);
		
		
		leia.close();
		

	}

}
