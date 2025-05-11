/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author Gabriel
 */

public class Aritmetica implements MediaStrategy {

    
    
    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String verificarSituacao(double media) {
        return (media >= 5.0) ? "Aprovado" : "Reprovado";
    }


}

