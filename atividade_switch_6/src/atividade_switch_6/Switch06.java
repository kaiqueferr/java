package atividade_switch_6;

import java.util.Scanner;

public class Switch06 {
	
	public class Switch05 {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int codigo;
			String cargo, nome;
			float salario, reajuste, novo;
			
			System.out.printf("Nome do colaborador:");
			nome = leia.nextLine();
			System.out.printf("Cargo:");
			codigo = leia.nextInt();
			System.out.printf("Salário:");
			salario = leia.nextFloat();
			
			switch(codigo) {
			  case 1:
				  reajuste = 0.1f;
				  cargo = "Gerente";
			    break;
			  case 2:
				  reajuste = 0.1f;
				  cargo = "Gerente";
			    break;
			  case 3:
				  reajuste = 0.1f;
				  cargo = "Gerente";
			    break;
			  case 4:
				  reajuste = 0.1f;
				  cargo = "Gerente";
			    break;
			  case 5:
				  reajuste = 0.1f;
				  cargo = "Gerente";
			    break;
			  case 6:
				  reajuste = 0.1f;
				  cargo = "Gerente";
			break;
			  default:
				  reajuste = 0.0f;
				  cargo = "Invalido";
			}
			
			novo = salario+ (reajuste*salario);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %s\n",cargo );
			System.out.printf("Salario: R$%.2f",novo );

		}

}
}
