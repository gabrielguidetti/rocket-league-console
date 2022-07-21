package processos;

import java.io.IOException;

public class EnfeitesTela {
	public static void menuOpcao() {
		System.out.println("=======ESCOLHA AS OP��ES=======");
	}
	
	public static void linhaSeparacao() {
		System.out.println();
		System.out.println("=============================================================");
		System.out.println();
	}
	
	public static void historicoCorrida() {
		System.out.println("=======HIST�RICO DE CORRIDAS=======");
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
