package br.unipe.mlpIII.programa.modelo;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String dataNascimento;
	
	public Pessoa(String nome,String cpf,String dataNascimento) {
		this.cpf=cpf;
		this.dataNascimento=dataNascimento;
		this.nome=nome;
	
	}
}
