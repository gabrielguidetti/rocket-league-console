package entities;

public class Motorista {
	
	private String nome;
	private Carteira carteira;
	private Garagem garagem;
	
	public Motorista(String nome, Carteira carteira, Garagem garagem) {
		this.nome = nome;
		this.carteira = carteira;
		this.garagem = garagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carteira getCarteira() {
		return carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}

	public Garagem getGaragem() {
		return garagem;
	}

	public void setGaragem(Garagem garagem) {
		this.garagem = garagem;
	}
	
}
