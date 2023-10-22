package controle;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import entidades.Componente;

public class EntradaEstoque {
	private Componente componente;
	private String data; 
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public Componente getComponente() {
		return componente;
	}
	public void setComponente(Componente componente) {
		this.componente = componente;
	} 
}
