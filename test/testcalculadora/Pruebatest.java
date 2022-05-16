/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcalculadora;
import calculadora1.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Begines
 */
public class Pruebatest {

    //atributo de la clase.Objeto tipo caluladora con id Casio.
    Calculadora Casio = new Calculadora();
    private int nTest;
    public Pruebatest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comenzando los test....");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Se ha finalizado la ejecución de los test");
    }

    @Before
    public void setUp() {
        nTest=nTest+1;
        System.out.println("Comienza n1 "+nTest + " test");
    }

    @After
    public void tearDown() {
        System.out.println("Fin del test "+nTest+" test");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void Pruebatest() {
        Casio.setNumero1(20);
        Casio.setNumero2(5);
        double resExperado = 25;
        assertEquals(resExperado, Casio.suma(), 1.0); //puede comparar muchas cosas, se llama de la misma forma pero tiene metodos distintos
    }

    @Test
    public void testResta() {
        Casio.setNumero1(50);
        Casio.setNumero2(10);
        double resExperado = 40;
        assertEquals(resExperado, Casio.resta(), 1.0);
    }
    @Test
    public void testMultiplicación() {
        Casio.setNumero1(50);
        Casio.setNumero2(10);
        double resExperado = 500;
        assertEquals(resExperado, Casio.multiplicacion(), 1.0);
    }
    @Test
    public void testDivision() {
        Casio.setNumero1(100);
        Casio.setNumero2(3);
        double resExperado = 33;
        assertEquals(resExperado, Casio.division(), 1.0);
    }
}
