package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.restcontroller;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Produto;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{estado}")
    public List<Produto> getProdutoById(@PathVariable String estado){
        return produtoService.findPrdutoByEstado(estado);
    }
}
