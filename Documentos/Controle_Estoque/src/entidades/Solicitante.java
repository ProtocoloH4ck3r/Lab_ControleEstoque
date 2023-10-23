package entidades;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solicitante {
	private String nome;
	private int matricula;
	List<Componente> componentes = new LinkedList<Componente>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void addComponente(Componente componente) {
		this.componentes.add(componente);
	}
	public List<Componente> getComponentes() {
		return componentes;
	}
	
}
