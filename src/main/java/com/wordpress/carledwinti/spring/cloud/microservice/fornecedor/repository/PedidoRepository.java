package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
