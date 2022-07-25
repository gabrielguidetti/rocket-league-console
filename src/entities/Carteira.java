package entities;

public class Carteira {
	private int saldo;

	public Carteira() {
		this.saldo = 100;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void adicionarSaldo(int qtd) {
		saldo += qtd;
	}
	
	public void retirarSaldo(int qtd) {
		saldo -= qtd;
	}
	
}
