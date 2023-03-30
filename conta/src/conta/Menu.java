package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.*;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("ok");
		Scanner leia = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		ContaController contas = new ContaController();
		
		
		
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Jeniffer", 100.000f, 10.00f);
		
		cc1.visualizar();
		
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*                  CREDIT SUISSE                    *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*           1 - Criar Conta                         *");
			System.out.println("*           2 - Listar todas as Contas              *");
			System.out.println("*           3 - Buscar Conta por Numero             *");
			System.out.println("*           4 - Atualizar Dados da Conta            *");
			System.out.println("*           5 - Apagar Conta                        *");
			System.out.println("*           6 - Sacar                               *");
			System.out.println("*           7 - Depositar                           *");
			System.out.println("*           8 - Transferir valores entre Contas     *");
			System.out.println("*           9 - Sair                                *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada::                         ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Erro! Apenas valores inteiros");
				leia.nextLine();
				opcao = 0;
			}
			

			if (opcao == 9) {
				System.out.println("\nCREDIT SUISSE - Qualquer coisa que te faça feliz!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 ->{ System.out.println("Criar Conta\n\n");
				
					System.out.println("Digite o Numero da Agência: ");
	                agencia = leia.nextInt();
	                System.out.println("Digite o Nome do Titular: ");
	                leia.skip("\\R?");
	                titular = leia.nextLine();
	
	                do {
	                    	System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
	                    	tipo = leia.nextInt();
	                	}while (tipo < 1 && tipo > 2);
	
	                System.out.println("Digite o Saldo da Conta (R$): ");
	                saldo = leia.nextFloat();
	
	                switch (tipo) {
		                case 1 -> {
		                    System.out.println("Digite o Limite de Crédito (R$): ");
		                    limite = leia.nextFloat();
		
		                    contas.cadastrar(new ContaCorrente(contas.gerarNumero(),1,1,"top", 1f,1f));
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = leia.nextInt();
		
		                    contas.cadastrar(new ContaCorrente(contas.gerarNumero(),1,1,"top", 1f,1f));
		                }
	                }
	                keyPress();
				}

				case 2 -> {
					System.out.println("Listar todas as Contas\n\n");
					contas.listaTodos();
					
					keyPress();
				}

				case 3 ->{ System.out.println("Consultar dados da Conta - por número\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					keyPress();
				}

				case 4 ->{ System.out.println("Atualizar dados da Conta\n\n");
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	
	                tipo = 1;
	                // condicional buscar na collection
	
	                System.out.println("Digite o Numero da Agência: ");
	                agencia = leia.nextInt();
	                System.out.println("Digite o Nome do Titular: ");
	                leia.skip("\\R?");
	                titular = leia.nextLine();
	
	                System.out.println("Digite o Saldo da Conta (R$): ");
	                saldo = leia.nextFloat();
	
	                // retornar tipo
	
	                switch (tipo) {
		                case 1 -> {
		                    System.out.println("Digite o Limite de Crédito (R$): ");
		                    limite = leia.nextFloat();
		
		                    // criar o objeto conta corrente
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = leia.nextInt();
		
		                    // criar o objeto conta poupanca
		
		                }
		                default -> {
		                    System.out.println("Tipo de conta inválido!");
		                }
	                }
	
	                // fim do condicional buscar na collection
	                keyPress();
				}

				case 5 ->{ System.out.println("Apagar a Conta\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					keyPress();
				}

				case 6 ->{ System.out.println("Saque\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					keyPress();
				}

				case 7 ->{ System.out.println("Depósito\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					keyPress();
				}
			
				case 8 ->{ System.out.println("Transferência entre Contas\n\n");
					System.out.println("Digite o Numero da Conta de Origem: ");
	                numero = leia.nextInt();
	                System.out.println("Digite o Numero da Conta de Destino: ");
	                numeroDestino = leia.nextInt();
	
	                do {
	                    System.out.println("Digite o Valor da Transferência (R$): ");
	                    valor = leia.nextFloat();
	                } while (valor <= 0);
	                keyPress();
				}

				default -> {
					System.out.println("\nOpção Inválida!\n");
					keyPress();
				}
			}
		}

	}
	
	public static void sobre()
	{
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("// Kaique Ferreira de Souza                    //");
		System.out.println("// Email: kaique.ferr@gmail.com                //");
		System.out.println("/////////////////////////////////////////////////");
		System.out.println(Cores.TEXT_RESET);
	}
	
	public static void keyPress()
	{
		try {
			System.out.println(Cores.TEXT_RESET +"Press Enter:");
			System.in.read();
		}catch(IOException e){
			System.out.println("Erro");
		}
	}
}
