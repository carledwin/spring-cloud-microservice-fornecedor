package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.dto;

public class ItemPedidoDto {

    private Long id;
    private Integer quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedidoDto{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                '}';
    }
}
