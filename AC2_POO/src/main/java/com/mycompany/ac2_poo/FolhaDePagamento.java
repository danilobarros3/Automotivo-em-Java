/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author danilobarros
 */
import java.util.HashMap;
import java.util.Map;

public class FolhaDePagamento {
    private final int mes;
    private final int ano;
    private final Map<String, Double> salarios;

    public FolhaDePagamento(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.salarios = new HashMap<>();
    }

    public void adicionarCondutor(String nome, double salario) {
        salarios.put(nome, salario);
    }

    public double totalAPagar() {
        double total = 0.0;
        for (double salario : salarios.values()) {
            total += salario;
        }
        return total;
    }

    public void imprimir() {
        System.out.println("Folha de Pagamento - " + mes + "/" + ano);
        System.out.println("---------------------------");
        for (Map.Entry<String, Double> entry : salarios.entrySet()) {
            String nome = entry.getKey();
            double salario = entry.getValue();
            System.out.println("Conductor: " + nome + " | Salário: R$" + salario);
        }
        System.out.println("---------------------------");
        System.out.println("Total a pagar: R$" + totalAPagar());
    }

   
    
}
