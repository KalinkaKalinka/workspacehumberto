package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.CD;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.tela.Magica;

public class AplicacaoProduto2 {

	public static void main(String[] args) {
	
	
	char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
	Produto produto = null;
	int id = Magica.i("ID");
	
	if (opcao=='L') {
		produto = new Livro(
				id,	Magica.s("Descricao"),	Magica.f("Compra"),	Magica.f("Venda"),
				Magica.i("QTDE"),Magica.s("Tipo"),Magica.s("ISBN"),	Magica.s("Autor"),Magica.s("Editora")
				);
	}else if (opcao=='C') {
		produto = new CD(
				id,	Magica.s("Descricao"),	Magica.f("Compra"),Magica.f("Venda"),
				Magica.i("QTDE"),Magica.s("Tipo"),Magica.s("Artista"),Magica.s("Gravadora"),Magica.s("Duracao")
				);
	}else {
		System.out.println("Opção Inválida");
	}
	
	System.out.println(produto.getAll());
	
	}

}
