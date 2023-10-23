package aplicação;

import entidades.Componente;
import entidades.Solicitante;

public class Principal {
	public static void main(String[] args) {
		Componente c1 = new Componente();
		Solicitante solicitante = new Solicitante();
		
		c1.setNome("resistor");
		c1.setId(10);
		c1.setQuantidade(50);
		solicitante.addComponente(c1);
		for(Componente c2: solicitante.getComponentes()) {
			System.out.println(c2.getNome());
		}
		
		
		
	
		
		
	}
}
