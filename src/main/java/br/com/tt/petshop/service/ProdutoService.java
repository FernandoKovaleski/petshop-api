package br.com.tt.petshop.service;

import br.com.tt.petshop.factory.ClienteFactory;
import br.com.tt.petshop.factory.ProdutoFactory;
import br.com.tt.petshop.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDetalhes buscarPorId (Long id){

        return produtoRepository.findById(id)
                .map(ProdutoFactory::criarProdutoDetalhes)
                .orElseThrow(()-> new RuntimeException ("o produto não existe"));
    }
}
