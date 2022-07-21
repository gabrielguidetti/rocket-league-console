package processos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Carro;

public class Corrida {
	
	private static Scanner sc = new Scanner(System.in);
	private int id;
	List<Carro> carros = new ArrayList<>();
	
	public Corrida(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void montarCorrida() {
		System.out.print("Quantos carros vão correr?");
		int qtd = sc.nextInt();
		System.out.println("Digite os apelidos dos carros:");
		Carro[] carros = new Carro[qtd];
		for(int i = 0; i < qtd; i++){
			System.out.print(i+1+"- ");
			carros[i] = new Carro(sc.nextLine(), "");
		}
		escalarCarros(carros);
	}
	
	private void escalarCarros(Carro[] carros) {
		for(Carro c : carros) {
			this.carros.add(c);
		}
	}
	
	
}
