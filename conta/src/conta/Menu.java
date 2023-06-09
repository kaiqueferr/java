package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.*;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("ok");
		Scanner leia = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		ContaController contas = new ContaController();
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
        contas.cadastrar(cc1);

        ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
        contas.cadastrar(cc2);

        ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
        contas.cadastrar(cp1);

        ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
        contas.cadastrar(cp2);
		
		
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

				case 4 ->{System.out.println("Atualizar dados da Conta\n\n");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				if(contas.buscarNaCollectin(numero) != null) {
					
					
					tipo = contas.retornaTipo(numero);
	
					System.out.println("Digite o Numero da Agência: ");
					agencia = leia.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
	
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = leia.nextFloat();
	
					switch (tipo) {
						case 1 -> {
							System.out.println("Digite o Limite de Crédito (R$): ");
							limite = leia.nextFloat();
		
							contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
							
						}
						case 2 -> {
							System.out.println("Digite o dia do Aniversario da Conta: ");
							aniversario = leia.nextInt();
		
							contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
		
						}
						default -> {
							System.out.println("Tipo de conta inválido!");
						}
					}
				}else {
					System.out.println("A Conta não foi encontrada!");
				}
				// fim do condicional buscar na collection

				keyPress();
				}

				case 5 ->{ System.out.println("Apagar a Conta\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					contas.deletar(numero);
					keyPress();
				}

				case 6 ->{ System.out.println("Saque\n\n");
					System.out.println("Saque\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					System.out.println("Digite o valor do Saque: ");
					valor = leia.nextFloat();
					contas.sacar(numero, valor);
					keyPress();
				}

				case 7 ->{ System.out.println("Depósito\n\n");
					System.out.println("Depósito\n\n");
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					System.out.println("Digite o valor do Depósito: ");
					valor = leia.nextFloat();
					contas.depositar(numero, valor);
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
	                contas.trasferir(numero, numeroDestino, valor);
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
