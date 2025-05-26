package model;

import java.time.LocalDate;

public class GastoFixo extends Gasto {
	
	
	//Construtor

	public GastoFixo() {
		super();	
	}

	public GastoFixo(double gasto, LocalDate data, String categoria, String descricao) {
		super(gasto, data, categoria, descricao);	
	}
	
	//Métodos
	@Override
	public String getFrequenciaGasto() {
		return "Gasto Fixo";
	}
	
}
