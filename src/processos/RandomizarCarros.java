package processos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.Carro;
import entities.CarroBot;

public class RandomizarCarros {
	private static Random random = new Random();
	private static String apelidos[] = {"Relampago", "Veloz", "Katchau", "Zoio", "Bolsonaro", "Lula", "Pikachu", "Charmander"};
	private static String modelos[] = {"Etios", "Honda civic", "Palio", "Fusca azul", "Citroen", "Ranger"};
	
	public static List<Carro> gerarParticipantes(int qtdBots){
		List<Carro> carros = new ArrayList<>(); 
		for(int i = 0; i < qtdBots;i++){
			carros.add(new CarroBot(apelidos[random.nextInt(apelidos.length-1)],modelos[random.nextInt(modelos.length-1)]));
		}
		return carros;
	}
}
