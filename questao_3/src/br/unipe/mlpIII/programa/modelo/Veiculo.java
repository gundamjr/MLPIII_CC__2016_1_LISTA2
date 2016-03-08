package br.unipe.mlpIII.programa.modelo;

public class Veiculo {
		protected String placa;
		protected String marca;
		protected String modelo;
		protected int ano;
		protected double valorKmRodado;
		protected double kmInicial;
		protected double kmFinal;
		protected double valorDaLocação;
		protected String chassi;
		protected Pessoa proprietário;
		
		public Veiculo(String placa,String marca,String modelo,int ano
				,double valorKmRodado,double kmInicial,double kmFinal
				,double valorDaLocação,String chassi,Pessoa proprietário) {
			
			this.placa=placa;
			this.marca=marca;
			this.modelo=modelo;
			this.ano=ano;
			this.valorKmRodado=valorKmRodado;
			this.kmInicial=kmInicial;
			this.kmFinal=kmFinal;
			this.valorDaLocação=valorDaLocação;
			this.chassi=chassi;
			this.proprietário=proprietário;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public double getKmInicial() {
			return kmInicial;
		}

		public void setKmInicial(double kmInicial) {
			this.kmInicial = kmInicial;
		}

		public double getKmFinal() {
			return kmFinal;
		}

		public void setKmFinal(double kmFinal) {
			this.kmFinal = kmFinal;
		}

		public double getValorDaLocação() {
			return valorDaLocação;
		}

		public void setValorDaLocação(double valorDaLocação) {
			this.valorDaLocação = valorDaLocação;
		}

		public String getChassi() {
			return chassi;
		}

		public void setChassi(String chassi) {
			this.chassi = chassi;
		}

		public void setValorKmRodado(double valorKmRodado) {
			this.valorKmRodado = valorKmRodado;
		}

		public double getValorKmRodado() {
			return valorKmRodado;
		}

		public Pessoa getProprietário() {
			return proprietário;
		}

		public void setProprietário(Pessoa proprietário) {
			this.proprietário = proprietário;
		}
		
		public void calcularValor(){
			valorDaLocação= ( kmFinal-kmInicial) * valorKmRodado;
		}
	public String toString() {
	return "Placa:= "+placa+" Marca:= "+marca+" Modelo:= "+modelo+" Ano:= "+ano+
			" valor Km Rodado:= "+valorKmRodado+" km Inicial:= "+kmInicial+
			" km Final:= "+kmFinal+" valor Da Locação:="+valorDaLocação+
			" Chassi:="+chassi+"Proprietario[CPF:= "+proprietário.cpf+
			" Nome:= "+proprietário.nome+" Data de nascimento:= "+
			proprietário.dataNascimento+"]";
	}

}
