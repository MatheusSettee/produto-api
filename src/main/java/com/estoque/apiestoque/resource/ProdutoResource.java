package com.estoque.apiestoque.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.apiestoque.entity.Produto;
import com.estoque.apiestoque.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    private ProdutoService produtoService;

    @Autowired
    public ProdutoResource(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos(){
        List<Produto> produtos = produtoService.getAll();
        if(produtos == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscarID(@PathVariable Long id){
        Optional<Produto> produto = produtoService.getById(id);
        if(produto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        Produto novoProduto = produtoService.save(produto);
        if(novoProduto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(novoProduto);
    }

    @PutMapping
    public ResponseEntity<Produto> atualizar(@RequestBody Produto produto){
        Produto novoProduto = produtoService.update(produto);
        if(novoProduto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(novoProduto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){
        produtoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
