/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author danilobarros
 */
class Condutor {
    private double salario;
    private String nome, data_De_Nascimento, cpf;
    ;
    public double getSalario() {
        return salario;
    }    
    public void setSalario(double salario) {
        this.salario = salario;               
  } 
    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setCpf(String Cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getData_De_Nascimento() {
        return data_De_Nascimento;
    }

    public void setData_De_Nascimento(String data_De_Nascimento) {
        this.data_De_Nascimento = data_De_Nascimento;
    }
    
}
