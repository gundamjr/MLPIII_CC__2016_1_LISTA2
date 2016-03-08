package br.unipe.mlpIII.locadora.modelo;

public class FitaI extends Fita{
	public FitaI(String titulo,double price,Categoria categoria,Autor autor) {
		super(titulo,price,categoria,autor);
	}
	public void calcularP() {
		price-=(0.40*price);
	}
	
}
