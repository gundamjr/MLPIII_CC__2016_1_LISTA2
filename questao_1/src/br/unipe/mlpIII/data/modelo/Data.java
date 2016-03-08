package br.unipe.mlpIII.data.modelo;

public final class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
	}
	
	public Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	}
	
	public Data(int dia, int mes) {
	this(dia,mes,2016);

	}
	public boolean verificar(){
		if((dia<1)||(dia>31)||(mes<1)||(mes>12)||(ano<0)){
			System.out.println("a data "+dia + "/" + mes + "/" + ano+" invalida");
		return false;
		}
		if((dia==29)&&(mes==2)&&(ano%4==0)){
			return true;
		}
		if((dia==29)&&(mes==2)&&(ano%4!=0)){
			System.out.println("a data "+dia + "/" + mes + "/" + ano+" invalida");
		return false;
		}
		return true;
	}
	public String toString() {
		return dia + "/" + mes + "/" + ano;
		}
}
