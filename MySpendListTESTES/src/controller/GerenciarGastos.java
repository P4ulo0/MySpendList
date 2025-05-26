package controller;

import java.util.ArrayList;

import model.Gasto;

public class GerenciarGastos {
	
	ArrayList<Gasto> listaDeGastos = new ArrayList<>();
	
	public void adicionarGasto(Gasto gasto) {
		listaDeGastos.add(gasto);
	}
	
	public void removerGastoIndice(int indice) {
		listaDeGastos.remove(indice);
	}
	
	public void listarGastos() {
		for (Gasto g : listaDeGastos) {
			System.out.println(g);
		}
	}
	
	public void listarGastosIndice() {
		for (int i = 0; i < listaDeGastos.size(); i++) {
			System.out.println(i + ": " + listaDeGastos.get(i));
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		
		for (Gasto g : listaDeGastos) {
			valorTotal += g.getValor();
		}
		
		return valorTotal;
	}
	

}
