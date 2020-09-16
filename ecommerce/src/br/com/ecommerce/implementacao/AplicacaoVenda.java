package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.tela.Magica;

public class AplicacaoVenda {
	
	public static void main(String[] args) {
		Venda venda = new Venda();
		Produto produto = new Produto(); // instanciei produto pq ele está dentro de Venda
		
		venda.setNumero(Magica.i("Número da Venda"));
		venda.setOperacao(Magica.s("Operação"));
		venda.setTotal(Magica.f("Valor Total"));
		
		venda.setProduto(produto); // colocando o objeto produto dentro do objeto venda
		
		produto.setDescricao(Magica.s("Descricao"));
		produto.setId(Magica.i("ID do Produto"));
		produto.setQtde(Magica.i("Qtde Produto"));
		produto.setTipo(Magica.s("Tipo do Produto"));
		produto.setValorCompra(Magica.f("Valor Compra"));
		produto.setValorVenda(Magica.f("Valor Venda"));
		
		//System.out.println(venda.getAll());
		System.out.println(venda.getTotal());
		System.out.println(venda.getProduto().getDescricao());
		
		
	}

}
