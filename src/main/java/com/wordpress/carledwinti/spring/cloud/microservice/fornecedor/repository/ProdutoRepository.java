package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    List<Produto> findByEstado(String estado);
    List<Produto> findByIdIn(List<Long> ids);
}
