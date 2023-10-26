package com.estoque.apiestoque.dtos;

import com.estoque.apiestoque.enums.Tipo;
import java.math.BigDecimal;

public class CadastroProduto {
    private String nome;

    private BigDecimal valor;

    private Tipo tipo;

    public CadastroProduto(String nome, BigDecimal valor, Tipo tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public CadastroProduto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
