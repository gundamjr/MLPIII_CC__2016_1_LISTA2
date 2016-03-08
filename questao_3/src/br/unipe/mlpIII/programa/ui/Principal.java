package br.unipe.mlpIII.programa.ui;

import br.unipe.mlpIII.programa.modelo.Pessoa;
import br.unipe.mlpIII.programa.modelo.Veiculo;
import br.unipe.mlpIII.programa.modelo.VeiculoCarga;
import br.unipe.mlpIII.programa.modelo.VeiculoPasseio;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa propietario1=new Pessoa("luna","142.365.982-12","24/04/1995");
		
		Veiculo caminhao=new VeiculoCarga("QWE-1010","Ford","VM 260",2015,200.0,
				50.0,100.0,0.0,"9BW ZZZ377",propietario1,142);
		
		caminhao.calcularValor();
		
		
		System.out.println(caminhao);
		
		Pessoa proprietario2=new Pessoa("Shinn","457.214.365-98","14/08/1325");
		
		Veiculo siena=new VeiculoPasseio("QAS-7845","Fiat","EL",2016,100.0,
				20.0,60.0,0.0,"1SE QQQ457",proprietario2,false,4);
		
		siena.calcularValor();
		
		System.out.println(siena);
		
		
	}

}
