package com.estoque.apiestoque.repository;

import com.estoque.apiestoque.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
