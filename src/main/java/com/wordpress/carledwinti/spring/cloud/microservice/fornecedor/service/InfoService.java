package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.service;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.InfoFornecedor;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository.InfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    Logger logger = LoggerFactory.getLogger(InfoService.class);

    public InfoFornecedor findByEstado(String estado) {

        InfoFornecedor infoFornecedorResponse = infoRepository.findByEstado(estado);

        logger.info(infoFornecedorResponse.toString());

        return infoFornecedorResponse;
    }

    public InfoFornecedor save(InfoFornecedor infoFornecedor) {

        return infoRepository.save(infoFornecedor);
    }
}
