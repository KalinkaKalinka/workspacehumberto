package br.com.universidade.modelo;

/*
 * Design Pattern (Padroes de Desenvolvimento)
 * Um dos Pattern´s é o DTO (Data Transfer Object), contém práticas para montar uma classe
 *  modelo/beans/java beans/to/dto (tudo com o mesmo propósito)
 *  Entre as práticas do DTO, estão:
 *  - os atributos devem ser privados
 *  - todo atributo deve possuir um Getter e um Setter
 */
public class Aluno {

	private int rm;
	private String nome;
	private String email;
	
	public int retornarRm() {
		return rm;
	}
	
	public String retornarEmail() {
		return email;
	}
	
	public String retornarNome() {
		return nome;
	}
	
	
	public void preencherEmail(String pEmail) {
		email=pEmail.toLowerCase();
	}
	
	public void preencherRm(int pRm) {
		rm=pRm;
	}
	
	/*
	 * Sintaxe para criação dos métodos:
	 * <modificador> <retorno> <nomeDoMetodo> (<tipoParametro1> <nomeParametro1>, ....)
	 */
	public void preencherNome(String pNome) {
		nome = pNome.toUpperCase();
	}
	
	
	
	
}








