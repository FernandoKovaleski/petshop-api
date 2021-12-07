package br.com.tt.petshop.dto;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;

public class ProdutoListagem {

    private final Long id;
    private final String nome;
    private final BigDecimal valor;
    private final Boolean ativo;

    @ConstructorProperties({"id", "nome", "valor", "ativo"})
    public ProdutoListagem(Long id, String nome, BigDecimal valor, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Boolean isAtivo() {

        return ativo;
    }
}
