/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author Gabriel
 */
public class Disciplina {

    private String nome;
    private double p1;
    private double p2;
    String situacao;
    private MediaStrategy estrategia;

    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public MediaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
  
    public double calcularMedia() {
        double media = estrategia.calcularMedia(p1, p2);
        this.situacao = estrategia.verificarSituacao(media);
        return media;
    }

}

