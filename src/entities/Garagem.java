package entities;

import java.util.ArrayList;
import java.util.List;

import processos.EnfeitesTela;

public class Garagem {
	List<CarroJogador> carros = new ArrayList<>();
	
	public Garagem() {
	}
	
	public CarroJogador selecionarCarroPorId(int id) {
		for(CarroJogador c : carros){
			if(c.getId() == id){
				return c;
			}
		}
		return null;
	}
	
	public int proximoId() {
		return (carros.size() == 0) ? 1 : carros.size()+1;
	}
	
	public void novoCarro(String apelido, String modelo) {
		carros.add(new CarroJogador(apelido,modelo,proximoId()));
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		EnfeitesTela.limparTela();
		EnfeitesTela.garagem();
		for(Carro c : carros){
			sb.append(c+"\n");
		}
		return sb.toString();
	}
}
