package br.unipe.mlpIII.programa.modelo;

public class VeiculoCarga extends Veiculo{
	protected int capacidadeCarga;
	
	public VeiculoCarga(String placa, String marca, String modelo, int ano, 
			double valorKmRodado, double kmInicial,double kmFinal, 
			double valorDaLoca��o, String chassi, Pessoa propriet�rio,
			int capacidadeCarga) {
		
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal, 
				valorDaLoca��o, chassi, propriet�rio);
		
		this.capacidadeCarga= capacidadeCarga;
	}
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String toString() {
		return "Placa:= "+placa+" Marca:= "+marca+" Modelo:= "+modelo+" Ano:= "+ano+
				" valor Km Rodado:= "+valorKmRodado+" km Inicial:= "+kmInicial+
				" km Final:= "+kmFinal+" valor Da Loca��o:="+valorDaLoca��o+
				" Chassi:="+chassi+"Proprietario[CPF:= "+propriet�rio.cpf+
				" Nome:= "+propriet�rio.nome+" Data de nascimento:= "+
				propriet�rio.dataNascimento+"]"+" Capacida de Carga:= "+
				capacidadeCarga;
		}

	

}
