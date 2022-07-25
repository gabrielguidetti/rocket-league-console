package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import processos.EnfeitesTela;
import processos.RandomizarCarros;

public class Corrida {
	
	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();
	private int id;
	private String nome;
	private String local;
	private Carro carroJogador;
	
	List<Carro> carros = new ArrayList<>();
	
	public Corrida(int id, Carro carroJogador) {
		this.id = id;
		this.carroJogador = carroJogador;
		System.out.print("Digite o nome da corrida: ");
		nome = sc.nextLine();
		System.out.print("Digite o local da corrida: ");
		local = sc.nextLine();
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
		carros = RandomizarCarros.gerarParticipantes(random.nextInt(6)+1);
		carros.add(carroJogador);
		correr();
	}
	
	private void correr() {
		Collections.shuffle(carros);
		mostrarClassificacao();
	}
	
	public void mostrarClassificacao() {
		EnfeitesTela.limparTela();
		System.out.println("CLASSIFICAÇÃO!!!!");
		System.out.println("Corrida: "+nome);
		System.out.println("Local: "+local);
		System.out.println();
		for(int posicao = 1; posicao <= carros.size(); posicao++) {
			System.out.println(posicao+"º " + carros.get(posicao-1).getApelido() + " / " + carros.get(posicao-1).getModelo());
		}
		System.out.println("Pressione enter para continuar: ");
		sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " | " + nome + " | Local: " + local;
	}
}
