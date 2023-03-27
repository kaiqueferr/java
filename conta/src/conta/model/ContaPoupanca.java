package conta.model;

public class ContaPoupanca extends Conta {
	
	private int aniversario;
	
	public ContaPoupanca(int numero, int gencia, int tipo, String tittular, float saldo, int aniversario) {
		super(numero, gencia, tipo, tittular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}

	
	
	

}
