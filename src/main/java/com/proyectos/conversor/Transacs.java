/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.conversor;

/**
 *
 * @author antoniozl
 */
public class Transacs {
    private double valor,resultado;
    private int divisa1,divisa2;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public Transacs() {
    }
    
    public double convertir(){

        switch(divisa1) {
        case 0 :
           // 1 peso son 0.00024 dolares 
           resultado=valor*0.00024;
           break;
        case 1 :
           // 1 peso son 0.00022 euros
           resultado=valor*0.00022;
           break;
        case 2 :
           // 1 peso son 0.00019 libras
           resultado=valor*0.00019;
           break;
        case 3 :
           // 1 peso son 0.035 yenes jpn
           resultado=valor*0.035;
           break;
        case 4 :
           // 1 peso son 0.32 wones
           resultado=valor*0.32;
           break;
        case 5 :
           //1 dolar  es 4,155.72 pesos
           resultado=valor*4155.72;
           break;
        case 6 :
           //1 euro es 4,535.72 pesos
           resultado=valor*4535.72;
           break;
        case 7 :
           //1 libra es 5,271.53 pesos
           resultado=valor*5271.53;
           break;
        case 8 :
           //1 yen es 28.79 pesos
           resultado=valor*28.79;
           break;
        case 9 :
           //1 won es 3.16 pesos
           resultado=valor*3.16;
           break;
        }
                
        return resultado;
    }
    
}
