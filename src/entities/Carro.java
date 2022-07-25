package entities;

public class Carro {

	private String apelido;
	private String modelo;
	
	public Carro(String apelido, String modelo) {
		this.apelido = apelido;
		this.modelo = modelo;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return apelido + " / " + modelo;
	}
	
}
