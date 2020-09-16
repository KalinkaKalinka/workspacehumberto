package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.tela.Magica;

public class TesteProduto {
	
	public static void main(String[] args) {
		Produto churros = new Produto();
		churros.setAll(
				Magica.i("ID"), 
				Magica.s("Descrição"), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")), 
				Integer.parseInt(JOptionPane.showInputDialog("QTDE")), 
				JOptionPane.showInputDialog("Tipo").toUpperCase()
				);
		System.out.println(churros.getDescricao());
		System.out.println(churros.getQtde());
		System.out.println(churros.getValorVenda());
		System.out.println("Total Compra: " + churros.getTotalCompra());
		System.out.println("Total Venda.: " + churros.getValorVenda());
		
		
	}
}
