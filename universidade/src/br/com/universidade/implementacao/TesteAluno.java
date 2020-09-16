package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		//Criando o objeto
		//Aluno objeto;
		
		//Instanciando o objeto
		Aluno objeto = new Aluno();
		
		objeto.preencherNome(JOptionPane.showInputDialog("Digite o Nome"));
		objeto.preencherEmail(JOptionPane.showInputDialog("Digite o Email"));
		objeto.preencherRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM")));
		
		System.out.println("RM: " + objeto.retornarRm());
		System.out.println("Nome: " + objeto.retornarNome());
		System.out.println("Email: " + objeto.retornarEmail());
		
		
	}
}
