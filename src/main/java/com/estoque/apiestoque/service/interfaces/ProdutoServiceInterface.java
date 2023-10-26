package com.estoque.apiestoque.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.estoque.apiestoque.entity.Produto;

public interface ProdutoServiceInterface {
    Produto save(Produto produto);
    Optional<Produto> getById(Long id);
    List<Produto> getAll();
    Produto update(Produto produto);
    void delete(Long id);
}