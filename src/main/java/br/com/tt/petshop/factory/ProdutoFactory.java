package br.com.tt.petshop.factory;

import br.com.tt.petshop.dto.ClienteListagem;
import br.com.tt.petshop.dto.ProdutoListagem;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.model.Produto;

public class ProdutoFactory {

    public static ProdutoListagem produtoListagem(Produto produto){
        return new ProdutoListagem(produto.getId(), produto.getNome(), produto.getValor());
    }
}
