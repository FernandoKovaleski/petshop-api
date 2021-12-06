package br.com.tt.petshop.factory;


import br.com.tt.petshop.dto.ProdutoListagem;
import br.com.tt.petshop.model.Produto;
import br.com.tt.petshop.service.ProdutoDetalhes;

public class ProdutoFactory {

    public static ProdutoListagem criarProdutoListagem(Produto produto) {
        return new ProdutoListagem(produto.getId(), produto.getNome(), produto.getValor(), produto.isAtivo());
    }

    public static ProdutoDetalhes criarProdutoDetalhes(Produto produto) {
        return new ProdutoDetalhes(produto.getId(), produto.getNome(), produto.getValor(), produto.isAtivo());
    }
}
