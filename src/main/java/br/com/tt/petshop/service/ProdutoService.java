package br.com.tt.petshop.service;

import br.com.tt.petshop.dto.ProdutoDetalhes;
import br.com.tt.petshop.dto.ProdutoListagem;
import br.com.tt.petshop.factory.ProdutoFactory;
import br.com.tt.petshop.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDetalhes buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .map(ProdutoFactory::criaProdutoDetalhes)
                .orElseThrow(() -> new RuntimeException("Não existe produto com esse ID!"));
    }
    /*public List<ProdutoListagem> listar (){
        return produtoRepository.findAll().stream()
                .map((ProdutoFactory::criaProdutoDetalhes))
                .collect(Collectors.toList());
    }

     */
}