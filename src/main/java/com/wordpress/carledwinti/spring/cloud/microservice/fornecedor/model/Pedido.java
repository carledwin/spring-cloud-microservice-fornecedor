package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.model;

import com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.enums.PedidoStatusEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer tempoDePreparo;

    @Enumerated(EnumType.STRING)
    private PedidoStatusEnum pedidoStatusEnum;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pedidoId")
    private List<ItemPedido> itensPedido;

    public Pedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Pedido(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(Integer tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public PedidoStatusEnum getPedidoStatusEnum() {
        return pedidoStatusEnum;
    }

    public void setPedidoStatusEnum(PedidoStatusEnum pedidoStatusEnum) {
        this.pedidoStatusEnum = pedidoStatusEnum;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", tempoDePreparo=" + tempoDePreparo +
                ", pedidoStatusEnum=" + pedidoStatusEnum +
                ", itensPedido=" + itensPedido +
                '}';
    }
}
