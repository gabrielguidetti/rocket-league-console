package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Corrida;
import entities.HistoricoCorridas;
import processos.EnfeitesTela;

public class Program {
	
	public static HistoricoCorridas historico = new HistoricoCorridas();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int escolha = -1;
		
		while(escolha != 0) {
			EnfeitesTela.limparTela();
			EnfeitesTela.menuOpcao();
			System.out.println("1 - Montar uma corrida");
			System.out.println("2 - Histórico de corridas");
			System.out.println("0 - SAIR");
			System.out.print("Sua opção: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					corridaCompleta();
					break;
				case 2:
					historicoCorridas();
					break;
			}
		}
		sc.close();
	}
	
	public static void corridaCompleta() {
		EnfeitesTela.limparTela();
		sc.nextLine();
		System.out.print("Digite o nome da corrida: ");
		String nome = sc.nextLine();
		System.out.print("Digite o local da corrida: ");
		String local = sc.nextLine();
		EnfeitesTela.limparTela();
		Corrida corrida = new Corrida(historico.proximoId(),nome,local);
		historico.adicionarCorrida(corrida);
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
	
	
}
