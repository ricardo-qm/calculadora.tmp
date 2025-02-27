package miPrincipal;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(5, 3);
        double resta = calculadora.restar(5, 3);
        double multiplicacion = calculadora.multiplicar(5, 3);
        double division = calculadora.dividir(5, 3);
        double seno = calculadora.seno(Math.PI / 2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Seno: " + seno);

        // Prueba de división por cero
        try {
            calculadora.dividir(5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
