package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import processos.Corrida;
import processos.EnfeitesTela;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int escolha = -1;
		
		while(escolha != 0) {
			limparTela();
			EnfeitesTela.menuOpcao();
			System.out.println("1 - Montar uma corrida");
			System.out.println("0 - SAIR");
			System.out.print("Sua opção: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					corridaCompleta();
					break;
			}
		}
		sc.close();
	}
	
	public static void corridaCompleta() {
		limparTela();
		Corrida corrida = new Corrida(1);
	}
	
	public static void limparTela() {
		try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}
	}
}
