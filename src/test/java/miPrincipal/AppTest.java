package miPrincipal;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class AppTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        double resultado = calculadora.sumar(2, 3);
        Assert.assertEquals(5, resultado, 0.001);
    }

    @Test
    public void testResta() {
        double resultado = calculadora.restar(5, 3);
        Assert.assertEquals(2, resultado, 0.001);
    }

    @Test
    public void testMultiplicacion() {
        double resultado = calculadora.multiplicar(2, 3);
        Assert.assertEquals(6, resultado, 0.001);
    }

    @Test
    public void testDivision() {
        double resultado = calculadora.dividir(6, 3);
        Assert.assertEquals(2, resultado, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero() {
        calculadora.dividir(6, 0);
    }

    @Test
    public void testSeno() {
        double resultado = calculadora.seno(Math.PI / 2);
        Assert.assertEquals(1, resultado, 0.001);
    }

    @Test
    public void testCoseno() {
        double resultado = calculadora.coseno(0);
        Assert.assertEquals(1, resultado, 0.001);
        
        resultado = calculadora.coseno(Math.PI);
        Assert.assertEquals(-1, resultado, 0.001);
    }

    @Test
    public void testTangente() {
        double resultado = calculadora.tangente(Math.PI / 4);
        Assert.assertEquals(1, resultado, 0.001);
        
        resultado = calculadora.tangente(0);
        Assert.assertEquals(0, resultado, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTangenteIndefinida() {
        calculadora.tangente(Math.PI / 2);
    }

    @Test
    public void testExponencialCero(){
        double resultado = calculadora.exponencial(0);
        Assert.assertEquals("Exponential of 0 should be 1", 1, resultado, 0.001);
    }

    @Test
    public void testExponencialUnoEsEuler(){
        double resultado = calculadora.exponencial(1);
        Assert.assertEquals(Math.E, resultado, 0.001);
    }
}
