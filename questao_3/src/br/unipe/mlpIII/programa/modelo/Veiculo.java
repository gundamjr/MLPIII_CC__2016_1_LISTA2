package br.unipe.mlpIII.programa.modelo;

public class Veiculo {
		protected String placa;
		protected String marca;
		protected String modelo;
		protected int ano;
		protected double valorKmRodado;
		protected double kmInicial;
		protected double kmFinal;
		protected double valorDaLoca��o;
		protected String chassi;
		protected Pessoa propriet�rio;
		
		public Veiculo(String placa,String marca,String modelo,int ano
				,double valorKmRodado,double kmInicial,double kmFinal
				,double valorDaLoca��o,String chassi,Pessoa propriet�rio) {
			
			this.placa=placa;
			this.marca=marca;
			this.modelo=modelo;
			this.ano=ano;
			this.valorKmRodado=valorKmRodado;
			this.kmInicial=kmInicial;
			this.kmFinal=kmFinal;
			this.valorDaLoca��o=valorDaLoca��o;
			this.chassi=chassi;
			this.propriet�rio=propriet�rio;
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

		public double getValorDaLoca��o() {
			return valorDaLoca��o;
		}

		public void setValorDaLoca��o(double valorDaLoca��o) {
			this.valorDaLoca��o = valorDaLoca��o;
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

		public Pessoa getPropriet�rio() {
			return propriet�rio;
		}

		public void setPropriet�rio(Pessoa propriet�rio) {
			this.propriet�rio = propriet�rio;
		}
		
		public void calcularValor(){
			valorDaLoca��o= ( kmFinal-kmInicial) * valorKmRodado;
		}
	public String toString() {
	return "Placa:= "+placa+" Marca:= "+marca+" Modelo:= "+modelo+" Ano:= "+ano+
			" valor Km Rodado:= "+valorKmRodado+" km Inicial:= "+kmInicial+
			" km Final:= "+kmFinal+" valor Da Loca��o:="+valorDaLoca��o+
			" Chassi:="+chassi+"Proprietario[CPF:= "+propriet�rio.cpf+
			" Nome:= "+propriet�rio.nome+" Data de nascimento:= "+
			propriet�rio.dataNascimento+"]";
	}

}
