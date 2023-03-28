package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	
	//crud
	public void procurarPorNumero(int numero);
	public void listaTodos();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	// metods bancarios
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void trasferir(int numero, int numeroDestino, float valor);
	

}
