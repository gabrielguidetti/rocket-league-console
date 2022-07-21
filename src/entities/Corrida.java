package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import processos.EnfeitesTela;

public class Corrida {
	
	private static Scanner sc = new Scanner(System.in);
	private int id;
	private String nome;
	private String local;
	
	List<Carro> carros = new ArrayList<>();
	
	public Corrida(int id,String nome, String local) {
		this.id = id;
		this.nome = nome;
		this.local = local;
		escalarCarros();
	}

	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	private void escalarCarros() {
		System.out.print("Quantos carros vão correr? ");
		int qtd = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite os apelidos dos carros:");
		
		for(int i = 0; i < qtd; i++){
			System.out.print(i+1+"- ");
			carros.add(new Carro(sc.nextLine(), ""));
		}
		
		correr();
	}
	
	private void correr() {
		Collections.shuffle(carros);
		mostrarClassificacao();
	}
	
	public void mostrarClassificacao() {
		EnfeitesTela.limparTela();
		EnfeitesTela.linhaSeparacao();
		System.out.println("CLASSIFICAÇÃO!!!!");
		System.out.println("Corrida: "+nome);
		System.out.println("Local: "+local);
		System.out.println();
		for(int posicao = 1; posicao <= carros.size(); posicao++) {
			System.out.println(posicao+"º " + carros.get(posicao-1).getApelido());
		}
		System.out.println("Pressione enter para continuar: ");
		sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " | " + nome + " | Local: " + local;
	}
}
