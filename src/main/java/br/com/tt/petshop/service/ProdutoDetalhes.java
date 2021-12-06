package br.com.tt.petshop.service;

import java.math.BigDecimal;

public class ProdutoDetalhes {
    private final Long id;
    private final String nome;
    private final BigDecimal valor;
    private final Boolean ativo;

    public ProdutoDetalhes(Long id, String nome, BigDecimal valor, Boolean ativo) {
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

    public Boolean getAtivo() {
        return ativo;
    }
}
