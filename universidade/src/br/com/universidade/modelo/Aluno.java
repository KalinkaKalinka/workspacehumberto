package br.com.universidade.modelo;

/*
 * Design Pattern (Padroes de Desenvolvimento)
 * Um dos Pattern�s � o DTO (Data Transfer Object), cont�m pr�ticas para montar uma classe
 *  modelo/beans/java beans/to/dto (tudo com o mesmo prop�sito)
 *  Entre as pr�ticas do DTO, est�o:
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
	 * Sintaxe para cria��o dos m�todos:
	 * <modificador> <retorno> <nomeDoMetodo> (<tipoParametro1> <nomeParametro1>, ....)
	 */
	public void preencherNome(String pNome) {
		nome = pNome.toUpperCase();
	}
	
	
	
	
}








