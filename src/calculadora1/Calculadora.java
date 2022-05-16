/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author Fernando Begines
 */

public class Calculadora {
// clase con constructor pasando dos numeros reales, setters , getters y métodos para devolver el resultado de sumar, restar , multiplicar y dividir
    private double numero1, numero2;

    public Calculadora(double numero1, double numero2){
       this.numero1=numero1;
       this.numero2=numero2;
    }
    public Calculadora(){
    }

    // sets and gets

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    

    //métodos aritmeticos

    public double suma(double numero1, double numero2) {
        double suma=numero1+numero2;
        return suma;
        
    }
    public double suma() {
        double suma=this.numero1+this.numero2;
        return suma;
        
    }

    public double resta(double numero1, double numero2) {
        double resta=numero1-numero2;
        return resta;
    }
     public double resta() {
        double resta=this.numero1-this.numero2;
        return resta;
    }

    public double multiplicacion(double numero1, double numero2){
        double multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public double multiplicacion(){
        double multiplicacion=this.numero1*this.numero2;
        return multiplicacion;
    }
    public double division(double numero1, double numero2) {
        double division=numero1/numero2;
        return division;
    }
    public double division() {
        double division=this.numero1/this.numero2;
        return division;
    }

}
