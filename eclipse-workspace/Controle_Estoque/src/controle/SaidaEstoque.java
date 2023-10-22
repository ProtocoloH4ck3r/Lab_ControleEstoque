package controle;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import entidades.Componente;
import entidades.Solicitante;

public class SaidaEstoque {
	private Componente componente;
	private Solicitante solicitante;
	private String data;
	private String justificativa;
	public SaidaEstoque() {
		this.devolvidoEstoque = false;
	}
	private boolean devolvidoEstoque;
	
	public Componente getComponentes() {
		return componente;
	}
	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public boolean DevolvidoEstoque() {
		return devolvidoEstoque;
	}
	public void setDevolvidoEstoque(boolean devolvidoEstoque) {
		this.devolvidoEstoque = devolvidoEstoque;
	}
}
