package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.CD;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.tela.Magica;

public class AplicacaoProduto {

	public static void main(String[] args) {
		
	char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
	if (opcao=='L') {
		Livro livro = new Livro(
				Magica.i("ID"),
				Magica.s("Descricao"),
				Magica.f("Compra"),
				Magica.f("Venda"),
				Magica.i("QTDE"),
				Magica.s("Tipo"),
				Magica.s("ISBN"),
				Magica.s("Autor"),
				Magica.s("Editora")
				);
		System.out.println(livro.getAll());
	}else if (opcao=='C') {
		CD cd = new CD(
				Magica.i("ID"),
				Magica.s("Descricao"),
				Magica.f("Compra"),
				Magica.f("Venda"),
				Magica.i("QTDE"),
				Magica.s("Tipo"),
				Magica.s("Artista"),
				Magica.s("Gravadora"),
				Magica.s("Duracao")
				);
		System.out.println(cd.getAll());
	}else {
		System.out.println("Opção Inválida");
	}
		

	}

}
