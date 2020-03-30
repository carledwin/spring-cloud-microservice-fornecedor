package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.restcontroller;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.InfoFornecedor;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoFornecedorRestController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoByEstado(@PathVariable String estado) {

        return infoService.findByEstado(estado);
    }
}
