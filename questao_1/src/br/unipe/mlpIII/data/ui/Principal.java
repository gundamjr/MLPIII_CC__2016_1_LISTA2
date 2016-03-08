package br.unipe.mlpIII.data.ui;

import br.unipe.mlpIII.data.modelo.Data;

public class Principal {
public static void main(String[] args) {
	Data date = new Data(1,-1,2015);
	
	if(date.verificar()){
		System.out.println(date);
	}
}
}
