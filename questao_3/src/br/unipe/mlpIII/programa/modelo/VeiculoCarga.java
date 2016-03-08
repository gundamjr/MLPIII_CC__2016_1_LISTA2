package br.unipe.mlpIII.programa.modelo;

public class VeiculoCarga extends Veiculo{
	protected int capacidadeCarga;
	
	public VeiculoCarga(String placa, String marca, String modelo, int ano, 
			double valorKmRodado, double kmInicial,double kmFinal, 
			double valorDaLocação, String chassi, Pessoa proprietário,
			int capacidadeCarga) {
		
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal, 
				valorDaLocação, chassi, proprietário);
		
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
				" km Final:= "+kmFinal+" valor Da Locação:="+valorDaLocação+
				" Chassi:="+chassi+"Proprietario[CPF:= "+proprietário.cpf+
				" Nome:= "+proprietário.nome+" Data de nascimento:= "+
				proprietário.dataNascimento+"]"+" Capacida de Carga:= "+
				capacidadeCarga;
		}

	

}
