package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}
