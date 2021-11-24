package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private TestEntityManager em;

    @BeforeEach
    void configuraMassa(){
        em.persist(criarProdutoRacao());
        em.persist(criaProdutoShampooo());
    }

    @Test
    void deveRetornarTodos(){
        List<Produto> produtos = produtoRepository.findAll();
        assertEquals(2, produtos.size());

        Produto produto1 = produtos.get(0);
        assertEquals("Ração Animais Pequenos", produto1.getNome());
        assertEquals(BigDecimal.valueOf(25.67), produto1.getValor());
        assertTrue(produto1.isAtivo());

        Produto produto2 = produtos.get(1);
        assertEquals("Shampoo Cão Feliz", produto2.getNome());
        assertEquals(BigDecimal.valueOf(25.30), produto2.getValor());
        assertTrue(produto2.isAtivo());
    }

    @Test
    void deveBuscarPeloNomeShampoo(){
        Produto produto = produtoRepository.findByNome("Shampoo Cão Feliz");
        assertEquals("Shampoo Cão Feliz", produto.getNome());
    }

    @Test
    void deveFiltrarContendoRacao(){
        List<Produto> produtos = produtoRepository.findByNomeContaining("Ração");
        assertEquals(1, produtos.size());
        assertEquals("Ração Animais Pequenos", produtos.get(0).getNome());
    }

    private Produto criaProdutoShampooo() {
        return new Produto(null, "Shampoo Cão Feliz", BigDecimal.valueOf(25.30), true);
    }

    private Produto criarProdutoRacao() {
        return new Produto(null, "Ração Animais Pequenos", BigDecimal.valueOf(25.67), true);
    }
}
