package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.service;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Produto;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findPrdutoByEstado(String estado){
        return produtoRepository.findByEstado(estado);
    }
}
