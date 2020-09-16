package br.com.universidadereferencia.beans;

public class Curso {

	private String nome;
	private float valor;
	private int cargaHoraria;
	
	public String getAll() {
		return 
				"Nome..........: " + nome + "\n" +
				"Carga Horária.: " + cargaHoraria + "\n" + 
				"Valor.........: " + valor;
	}
	public void setAll(String nome, float valor, int cargaHoraria) {
		this.nome = nome;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	public Curso(String nome, float valor, int cargaHoraria) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	public Curso() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
