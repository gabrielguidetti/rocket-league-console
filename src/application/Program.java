package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Carteira;
import entities.Corrida;
import entities.Garagem;
import entities.HistoricoCorridas;
import entities.Motorista;
import processos.EnfeitesTela;

public class Program {
	
	public static HistoricoCorridas historico = new HistoricoCorridas();
	public static Scanner sc = new Scanner(System.in);
	public static Motorista jogador;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int escolha = -1;
		EnfeitesTela.limparTela();
		System.out.print("Digite seu nome: ");
		jogador = new Motorista(sc.nextLine(),new Carteira(), new Garagem());
		
		while(escolha != 0) {
			EnfeitesTela.limparTela();
			EnfeitesTela.menuOpcao();
			System.out.println("1 - Montar uma corrida");
			System.out.println("2 - Hist�rico de corridas");
			System.out.println("3 - Comprar carro");
			System.out.println("4 - Ver garagem");
			System.out.println("0 - SAIR");
			System.out.print("Sua op��o: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					corridaCompleta();
					break;
				case 2:
					historicoCorridas();
					break;
				case 3:
					mostrarloja();
					break;
				case 4:
					mostrarGaragem();
					break;
			}
		}
		sc.close();
	}
	
	public static void corridaCompleta() {
		EnfeitesTela.limparTela();
		System.out.println(jogador.getGaragem());
		System.out.print("Selecione o Id do carro que ir� correr (digite 0 para voltar): ");
		int id = sc.nextInt();
		if(id != 0) {
			EnfeitesTela.limparTela();
			Corrida corrida = new Corrida(historico.proximoId(),jogador.getGaragem().selecionarCarroPorId(id));
			historico.adicionarCorrida(corrida);
		}
	}
	
	public static void historicoCorridas() {
		int escolha = -1;
		while(escolha != 0) {
			EnfeitesTela.limparTela();
			System.out.println(historico);
			System.out.println("Selecione o id de uma corrida (digite 0 para voltar): ");
			escolha = sc.nextInt();
			if(escolha == 0) {break;}
			historico.buscarCorrida(escolha).mostrarClassificacao();
		}
	}
	
	public static void mostrarloja() {
		EnfeitesTela.limparTela();
		sc.nextLine();
		System.out.print("Digite o apelido do carro: ");
		String apelido = sc.nextLine();
		System.out.print("Digite o modelo do carro: ");
		String modelo = sc.nextLine();
		jogador.getGaragem().novoCarro(apelido, modelo);
	}
	
	public static void mostrarGaragem() {
		
	}
	
}
