package model;

import java.time.LocalDate;

public abstract class Gasto {
	
	//Atributos
	private double valor; 
	private LocalDate data;
	private String categoria;
	private String descricao;
	
	//Construtor
	public Gasto(double gasto, LocalDate data, String categoria, String descricao) {
		
		this.valor = gasto;
		this.data = data;
		this.categoria = categoria;
		this.descricao = descricao;	
	}
	
	public Gasto() {}
	
	//Métodos
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract String getFrequenciaGasto();
	
	@Override
	public String toString() {
		return "Descrição: " + descricao + ", Valor: R$ " + valor + 
				", Categoria: " + categoria + ", Data: " + data;
	}
}
