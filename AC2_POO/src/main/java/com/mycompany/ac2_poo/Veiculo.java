/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author danilobarros
 */
public interface Veiculo {
    double gastoCombustivel(double distancia, double valorCombustivel);
    double getCombustivel();
    void setCombustivel(double combustivel);
    double getConsumo();
    void setConsumo(double consumo);
    String getPlaca();
    void setPlaca(String placa); 
    void setNome(String Nome); 
    String getNome();
    void setTipo(String tipo);
    String getTipo();
    
}
