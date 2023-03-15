package atividade_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$###,###,##0.00");
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, nSalario;
		
		System.out.println("Digite o salario:");
		salario = sc.nextFloat();
		System.out.println("Digite o abono:");
		abono = sc.nextFloat();
		
		nSalario = salario + abono;
		
		System.out.println("Novo salario: "+ df.format(nSalario));
		
	
	}

}
