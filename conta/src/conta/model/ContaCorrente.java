package conta.model;

public class ContaCorrente extends Conta {
	private float limite;
	public ContaCorrente(int numero, int gencia, int tipo, String tittular, float saldo, float limite) {
		super(numero, gencia, tipo, tittular, saldo);
		this.limite = limite;
		
		
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Limite:" + limite);
	}
	
	@Override
	public boolean sacar(float valor)
	{
		if(this.getSaldo() + this.getLimite() < valor)
		{
			System.out.println("Saldo Insuficiente");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	
	
}
