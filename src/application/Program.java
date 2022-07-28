package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carteira;
import entities.Corrida;
import entities.Garagem;
import entities.HistoricoCorridas;
import entities.Motorista;
import exceptions.ErroNumeroException;
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
			System.out.println("2 - Histórico de corridas");
			System.out.println("3 - Comprar carro");
			System.out.println("4 - Ver garagem");
			System.out.println("0 - SAIR");
			System.out.print("Sua opção: ");
			try {
				escolha = sc.nextInt();
				if(escolha < 0 || escolha > 4){
					throw new ErroNumeroException("Apenas números de 0 a 4 são válidos!");
				}
			} catch(ErroNumeroException e) {
				System.out.println(e.getMessage());
				escolha = -1;
				sc.next();
			} catch(RuntimeException e) {
				System.out.println("Apenas números válidos!");
				escolha = -1;
			}
			
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
		System.out.print("Selecione o Id do carro que irá correr (digite 0 para voltar): ");
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
		EnfeitesTela.limparTela();
		System.out.println(jogador.getGaragem());
		sc.next();
	}
	
}
