package br.com.tt.petshop.factory;

import br.com.tt.petshop.dto.ProdutoDetalhes;
import br.com.tt.petshop.model.Produto;

public class ProdutoFactory {
    public static ProdutoDetalhes criaProdutoDetalhes(Produto produto){
        return new ProdutoDetalhes(
                produto.getId(),
                produto.getNome(),
                produto.getValor(),
                produto.isAtivo());
    }
}