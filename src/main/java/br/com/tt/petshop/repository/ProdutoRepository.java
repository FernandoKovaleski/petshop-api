package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByNome(String nome);

    List<Produto> findByNomeContaining(String nome);

    //TODO Buscar produtos no intervalo de valor (mínimo, máximo)
}
