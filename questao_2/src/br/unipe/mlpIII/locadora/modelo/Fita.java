package br.unipe.mlpIII.locadora.modelo;

public abstract class Fita {

	private String titulo;
	public double price;
	private Categoria categoria;
	private Autor autor;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Fita(String titulo,double price,Categoria categoria,Autor autor) {
		this.titulo=titulo;
		this.price=price;
		this.categoria=categoria;
		this.autor=autor;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void calcularP(){
	}
	
	public String toString() {
		return "Titulo: "+titulo+" preco: "+price+" categoria: "+categoria;
}
	
}
