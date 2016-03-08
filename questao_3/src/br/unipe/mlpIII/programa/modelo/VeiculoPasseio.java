package br.unipe.mlpIII.programa.modelo;

public class VeiculoPasseio extends Veiculo{
       protected boolean ar;
       protected int quantidadeDePortas;
       
	public VeiculoPasseio(String placa, String marca, String modelo, int ano, 
			double valorKmRodado, double kmInicial,double kmFinal, 
			double valorDaLoca��o, String chassi, Pessoa propriet�rio,
			boolean ar,int quantidadeDePortas) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal, valorDaLoca��o, chassi, propriet�rio);
	this.ar=ar;
	this.quantidadeDePortas= quantidadeDePortas;
	}
	
	public boolean isAr() {
		return ar;
	}
	public void setAr(boolean ar) {
		this.ar = ar;
	}
	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}
	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
	
	public String toString() {
		if (ar)
			System.out.print("possui ar ");
		else
			System.out.print("n�o possui ar ");
		
		return "Placa:= "+placa+" Marca:= "+marca+" Modelo:= "+modelo+" Ano:= "+ano+
				" valor Km Rodado:= "+valorKmRodado+" km Inicial:= "+kmInicial+
				" km Final:= "+kmFinal+" valor Da Loca��o:="+valorDaLoca��o+
				" Chassi:="+chassi+"Proprietario[CPF:= "+propriet�rio.cpf+
				" Nome:= "+propriet�rio.nome+" Data de nascimento:= "+
				propriet�rio.dataNascimento+"]"+" Quantidade de portas:= "+
				quantidadeDePortas;
		}
}
