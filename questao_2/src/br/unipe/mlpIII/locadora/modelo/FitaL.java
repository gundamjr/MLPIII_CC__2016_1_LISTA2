package br.unipe.mlpIII.locadora.modelo;

public class FitaL extends Fita{
	
	public FitaL(String titulo,double price,Categoria categoria,Autor autor) {
		super(titulo,price,categoria,autor);
		
	}
	public void calcularP() {
		price+=(0.20*price);
	}
 
}
