package application;

import java.util.Locale;
import java.util.Scanner;

import processos.Corrida;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int escolha = 9;
		
		while(escolha != 0) {
			clearScreen();
			System.out.println("=======ESCOLA AS OPÇÕES=======");
			System.out.println("1 - Montar uma corrida");
			System.out.println("0 - SAIR");
			System.out.print("Sua opção: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					clearScreen();
					Corrida corrida = new Corrida(1);
					break;
			}
		}
		
		
		sc.close();
	}
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
