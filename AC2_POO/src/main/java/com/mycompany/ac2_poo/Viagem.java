/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ac2_poo;


/**
 *
 * @author danilobarros
 */
public class Viagem implements Comparable<Viagem> {
    private String cidadeOrigem;
    private String cidadeDestino;
    private double distancia;
    private Veiculo veiculo;
    private Condutor condutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, Veiculo veiculo, Condutor condutor) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.condutor = condutor;
    }

    public double custo() {
        double diarias = distancia / 700;
        return (distancia / veiculo.getConsumo()) * (diarias * condutor.getSalario());
    }

    // Getters e Setters

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    // Implementação do método compareTo para ordenação

    @Override
    public int compareTo(Viagem outraViagem) {
        return Double.compare(this.custo(), outraViagem.custo());
    }
}
