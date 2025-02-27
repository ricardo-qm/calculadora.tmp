// Crea pruebas unitarias para una clase Calculadora.java que se encuentra en el paquete miPrincipal

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
}