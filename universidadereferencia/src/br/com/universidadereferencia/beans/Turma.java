package br.com.universidadereferencia.beans;

public class Turma {
	private String sigla;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	
	public String getAll() {
		return 
				"Sigla...: " + sigla + "\n" +
				"Período.: " + periodo + "\n" +
				"Curso:\n " + curso.getAll() + "\n" +
				"Aluno:\n " + aluno.getAll();
	}
	
	public void setAll(String sigla, String periodo, Curso curso, Aluno aluno) {
		this.sigla = sigla;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
	}
	public Turma(String sigla, String periodo, Curso curso, Aluno aluno) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
	}
	public Turma() {
		super();
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
