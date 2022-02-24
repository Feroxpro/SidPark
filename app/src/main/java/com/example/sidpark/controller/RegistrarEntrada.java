package com.example.sidpark.controller;

import com.example.sidpark.model.Carro;

public class RegistrarEntrada {

    public void createCarro(String marca, String modelo, String cor, String placa, String entrada) {
            Carro carro = new Carro();
            carro.setMarca(marca);
            carro.setModelo(modelo);
            carro.setCor(cor);
            carro.setPlaca(placa);
            carro.setEntrada(entrada);

        verifyEntrada(carro);
    }

    void verifyEntrada(Carro carro) {
        String concatenandoCarro;

        concatenandoCarro = "Marca: " + carro.getMarca() + " Modelo: " +
                carro.getModelo() + " Cor: " + carro.getCor() + " Placa: " +
                carro.getPlaca() + " Data de entrada: " + carro.getEntrada();

        if (carro != null) {
            System.out.println("Carro Salvo");
            System.out.println("Dados do carro salvo: " + concatenandoCarro);
        } else {
            System.out.println("Carro Não Salvo");
        }
    }
}
