package com.estoque.apiestoque.dtos;

import com.estoque.apiestoque.enums.Tipo;
import java.math.BigDecimal;

public class DadosProduto {
    private Long codigo;

    private String nome;

    private BigDecimal valor;

    private Tipo tipo;

    public DadosProduto(Long codigo, String nome, BigDecimal valor, Tipo tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public DadosProduto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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
