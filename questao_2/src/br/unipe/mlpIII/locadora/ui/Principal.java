package br.unipe.mlpIII.locadora.ui;

import br.unipe.mlpIII.locadora.modelo.Autor;
import br.unipe.mlpIII.locadora.modelo.Categoria;
import br.unipe.mlpIII.locadora.modelo.Fita;
import br.unipe.mlpIII.locadora.modelo.FitaL;

public class Principal {

	public static void main(String[] args) {
		Autor autor=new Autor("Luna");
		Fita avatar=new FitaL("avatar",10.0,Categoria.Acao,autor);
		
		avatar.calcularP();
		
		System.out.println(avatar);

	}

}
