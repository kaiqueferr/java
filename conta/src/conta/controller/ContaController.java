package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> lista = new ArrayList<Conta>();
	int numero = 0;
	
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollectin(numero);
		
		if(conta != null)
		{
			conta.visualizar();
		}else
		{
			System.out.println("Não ENcontrado");
		}
		
	}

	@Override
	public void listaTodos() {
		for(var conta : lista) {
			conta.visualizar();
		}
			
		
	}

	@Override
	public void cadastrar(Conta conta) {
		lista.add(conta);
		System.out.println("A conta No: " + conta.getNumero() + " foi criada!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollectin(numero);
		
		if(buscaConta != null)
		{
			lista.set(lista.indexOf(buscaConta), conta);
			System.out.println("Atualizado!");
		}else
		{
			System.out.println("Não Encontrado");
		}
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollectin(numero);
		
		if(conta != null)
		{
			if(lista.remove(conta) == true)
			{
				System.out.println("A cota foi excluida!");
			}
		}else
		{
			System.out.println("Não Encontrado!");
		}
		
		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollectin(numero);

		if (conta != null) {
			if(conta.sacar(valor) == true)
				System.out.println("O Saque foi efetuado com sucesso!");
		}else
			System.out.println("Não Encontrada!");
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollectin(numero);

		if (conta != null) {
			conta.depositar(valor);
				System.out.println("O Depósito foi efetuado com sucesso!");
		}else
			System.out.println("Não Encontrada!");
		
	}

	@Override
	public void trasferir(int numero, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollectin(numero);
		var contaDestino = buscarNaCollectin(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if(contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("A Transferência foi efetuada com sucesso!");
			}
		}
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Conta buscarNaCollectin(int numero)
	{
		for(var conta : lista)
		{
			if(conta.getNumero() == numero)
			{
				return conta;
			}
		}
		return null;
	}
	
	public int retornaTipo(int numero) {
		for (var conta : lista) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}

		return 0;
	}

}
