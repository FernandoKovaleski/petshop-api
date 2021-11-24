package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByNome(String nome);
    List<Produto> findByNomeContaining(String nome);
}
