package entities;

public class CarroJogador extends Carro{
	
	private int id;

	public CarroJogador(String apelido, String modelo, int id) {
		super(apelido, modelo);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return id + "- " + super.getApelido() + " / " + super.getModelo();
	}
	
}
