package com.estoque.apiestoque.service;

import com.estoque.apiestoque.entity.Produto;
import com.estoque.apiestoque.repository.ProdutoRepository;
import com.estoque.apiestoque.service.interfaces.ProdutoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class ProdutoService implements ProdutoServiceInterface {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto save(Produto produto) {
        produto.setCodigoBarras(UUID.randomUUID().toString());
        return produtoRepository.save(produto);
    }

    @Override
    public Optional<Produto> getById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto update(Produto produto) {

        Optional<Produto> upProduto = produtoRepository.findById(produto.getId());

        if(upProduto.isPresent()) {
            Produto newProduto = upProduto.get();
            if(produto.getNome() != null){
                newProduto.setNome(produto.getNome());
            }
            if(produto.getValor() != null){
                newProduto.setValor(produto.getValor());
            }
            return produtoRepository.save(newProduto);
        }
        return produto;
    }

    @Override
    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

}

