/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ac2_poo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author danilobarros
 */
class Relatorios {
    private final List<Condutor> condutores;
    private final List<Veiculo> veiculos;

    public Relatorios() {
        this.condutores = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }

    public void adicionarCondutor(Condutor condutor) {
        condutores.add(condutor);
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void imprimeCondutores() {
        Collections.sort(condutores, Comparator.comparing(Condutor::getCpf));

        System.out.println("Condutores ordenados por CPF:");
        for (Condutor condutor : condutores) {
            System.out.println("CPF: " + condutor.getCpf() + ", Nome: " + condutor.getNome());
        }
    }

    public void imprimeVeiculos() {
        Collections.sort(veiculos, Comparator.comparing(Veiculo::getNome));

        System.out.println("Veículos ordenados por nome:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("Nome: " + veiculo.getNome() + ", Tipo: " + veiculo.getTipo());
        }
    }
}
