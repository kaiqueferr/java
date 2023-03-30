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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trasferir(int numero, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
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

}
