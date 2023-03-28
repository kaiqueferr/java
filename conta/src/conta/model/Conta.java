package conta.model;

public abstract class Conta {
	
	private int numero;
	private int gencia;
	private int tipo;
	private String tittular;
	private float saldo;
	
	public Conta(int numero, int gencia, int tipo, String tittular, float saldo) {
		this.numero = numero;
		this.gencia = gencia;
		this.tipo = tipo;
		this.tittular = tittular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getGencia() {
		return gencia;
	}

	public void setGencia(int gencia) {
		this.gencia = gencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTittular() {
		return tittular;
	}

	public void setTittular(String tittular) {
		this.tittular = tittular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor)
	{
		if(this.getSaldo() < valor)
		{
			System.out.println("Saldo Insuficiente");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valor)
	{
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void visualizar()
	{
		String tipo = "";
		switch(this.tipo)
		{
		case 1 -> tipo = "Conta Corrente";
		case 2 -> tipo = "Conta Poupanca";
		}
		System.out.println("***********************************************");
		System.out.println("               dados da conta");
		System.out.println("***********************************************");
		System.out.println("N da conta" + this.numero);
		System.out.println("N da agencia" + this.gencia);
		System.out.println("Tio da conta" + tipo);
		System.out.println("Titular:" + this.tittular);
		System.out.println("Saldo: " + this.saldo);
	}

}
