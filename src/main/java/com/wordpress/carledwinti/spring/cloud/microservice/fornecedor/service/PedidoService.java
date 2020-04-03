package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.service;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.dto.ItemPedidoDto;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.enums.PedidoStatusEnum;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.ItemPedido;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Pedido;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model.Produto;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository.PedidoRepository;
import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido realizaPedido(List<ItemPedidoDto> itensPedidoDto){

        if(itensPedidoDto == null){
            return null;
        }

        List<ItemPedido> itensPedido = toItemPedido(itensPedidoDto);

        Pedido pedido = new Pedido(itensPedido);
        pedido.setPedidoStatusEnum(PedidoStatusEnum.RECEBIDO);
        pedido.setTempoDePreparo(itensPedido.size());

        return pedidoRepository.save(pedido);
    }

    private List<ItemPedido> toItemPedido(List<ItemPedidoDto> itensPedidoDto) {

        List<Long> idsProdutos = itensPedidoDto.stream()
                .map(item -> item.getId())
                .collect(Collectors.toList());

        List<Produto> produtos = produtoRepository.findByIdIn(idsProdutos);

        List<ItemPedido> itensPedido = itensPedidoDto.stream()
                .map(item -> {

                    Produto produto = produtos.stream()
                            .filter(p -> p.getId() == item.getId())
                            .findFirst().get();

                    ItemPedido itemPedido = new ItemPedido();
                    itemPedido.setProduto(produto);
                    itemPedido.setQuantidade(item.getQuantidade());

                    return itemPedido;
                })
                .collect(Collectors.toList());
        return itensPedido;
    }

    public Pedido getPedidoById(Long id){
        return this.pedidoRepository.findById(id).orElse(new Pedido());
    }
}
