package model;

import java.time.LocalDate;

public class GastoPontual extends Gasto {

	//Construtor
	public GastoPontual() {
		super();
	}
	
	public GastoPontual(double gasto, LocalDate data, String categoria, String descricao) {
		super(gasto, data, categoria, descricao);	
	}

	//Métodos
	@Override
	public String getFrequenciaGasto() {
		return "Gasto Pontual";
	}
}
