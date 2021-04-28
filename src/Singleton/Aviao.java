package Singleton;

import java.util.HashSet;
import java.util.Set;

public class Aviao {
	
	private static Aviao instance = new Aviao();
	
	private Set<String> assentosDisponiveis;
	
	private Aviao() {
		this.assentosDisponiveis = new HashSet<String>();
		this.assentosDisponiveis.add("A1");
		this.assentosDisponiveis.add("B1");
	}
	
	public static Aviao getInstance() {
		return instance;
	}
	
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
		
	}
}
