/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author danilobarros
 */
class Caminhao implements Veiculo {
    private double combustivel, consumo;
    private String placa, nome, tipo;
    private int quantidadeEixos;

    @Override
    public double gastoCombustivel(double distancia, double valorCombustivel) {
        return (distancia / consumo) * valorCombustivel;
    }

    @Override
    public double getCombustivel() {
        return combustivel;
    }

    @Override
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos=quantidadeEixos;
    }

    @Override
    public void setNome(String Nome) {
         this.nome=Nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
                