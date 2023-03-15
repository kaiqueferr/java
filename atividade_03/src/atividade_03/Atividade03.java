package atividade_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade03 {
	
	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,###,##0.00");
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno , horasExtras, descontos, sLinquido;
		
		System.out.println("Salário Bruto:");
		salarioBruto = sc.nextFloat();
		System.out.println("Adicional Noturno:");
		adicionalNoturno = sc.nextFloat();
		System.out.println("Horas Extras:");
		horasExtras = sc.nextFloat();
		System.out.println("Descontos:");
		descontos = sc.nextFloat();
		
		
		sLinquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("SALÁRIO LÍQUIDO: "+ df.format(sLinquido));
		
	
	}

}
