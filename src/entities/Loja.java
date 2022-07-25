package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import processos.EnfeitesTela;

public class Loja {
	private static Scanner sc = new Scanner(System.in);
	private List<Carro> carrosVenda = new ArrayList<>();
	
	public Loja(){
		EnfeitesTela.limparTela();
		System.out.print("Digite o apelido do carro: ");
		String apelido = sc.nextLine();
		System.out.print("Digite o modelo do carro: ");
		String modelo = sc.nextLine();
		
	}
}
