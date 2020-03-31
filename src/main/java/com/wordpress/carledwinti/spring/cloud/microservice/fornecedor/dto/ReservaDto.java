package com.wordpress.carledwinti.spring.cloud.microservice.fornecedor.dto;

public class ReservaDto {

    private Integer id;
    private Integer tempoDePreparo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(Integer tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    @Override
    public String toString() {
        return "ReservaDto{" +
                "id=" + id +
                ", tempoDePreparo=" + tempoDePreparo +
                '}';
    }
}
