package entities;

import java.util.ArrayList;
import java.util.List;

import processos.EnfeitesTela;

public class HistoricoCorridas {
	List<Corrida> corridas = new ArrayList<>();
	
	public HistoricoCorridas() {
	}
	
	public void adicionarCorrida(Corrida corrida) {
		corridas.add(corrida);
	}
	
	public int proximoId() {
		return (corridas.size() == 0) ? 1 : corridas.size()+1;
	}
	
	public Corrida buscarCorrida(int id) {
		for(Corrida c : corridas) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		EnfeitesTela.historicoCorrida();
		for(Corrida c : corridas){
			sb.append(c + "\n");
		}
		return sb.toString();
	}
}
