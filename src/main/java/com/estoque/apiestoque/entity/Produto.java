package com.estoque.apiestoque.entity;

import com.estoque.apiestoque.enums.Tipo;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoBarras;

    private String nome;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    public Produto() {}
    public Produto(Long id, String codigoBarras, String nome, BigDecimal valor, Tipo tipo) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getCodigoBarras() {return codigoBarras;}

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
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
