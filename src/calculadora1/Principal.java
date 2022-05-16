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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora casio1 = new Calculadora(20,4);
        Calculadora casio2 = new Calculadora();
        
        System.out.println("La suma de los dos numeros es " + casio1.suma(5,2));
        
        double resEsperado=7;
        
        if(resEsperado==casio1.suma(5,2)){
            System.out.println("El test de métotod suma es correcto");
        }else{
            System.out.println("No es correcto");
        }
        
        System.out.println("La división de los dos números es "+casio2.division(20, 2));
        
        
        
    }
    
}
