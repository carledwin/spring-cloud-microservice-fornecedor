package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.restcontroller;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.dto.ItemPedidoDto;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Pedido;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/new")
    public Pedido realizaPedido(@RequestBody List<ItemPedidoDto> itensPedidoDto){
        return pedidoService.realizaPedido(itensPedidoDto);
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable Long id){
        return pedidoService.getPedidoById(id);
    }
}
