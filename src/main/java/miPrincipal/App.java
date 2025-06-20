package miPrincipal;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Operaciones básicas
        double suma = calculadora.sumar(5, 3);
        double resta = calculadora.restar(5, 3);
        double multiplicacion = calculadora.multiplicar(5, 3);
        double division = calculadora.dividir(5, 3);

        // Funciones trigonométricas
        double seno = calculadora.seno(Math.PI / 2);    // 90 grados
        double coseno = calculadora.coseno(0);          // 0 grados
        double tangente = calculadora.tangente(Math.PI / 4); // 45 grados

        // Exponencial
        double exponencial = calculadora.exponencial(2.5);

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Seno(90°): " + seno);
        System.out.println("Coseno(0°): " + coseno);
        System.out.println("Tangente(45°): " + tangente);
        System.out.println("Exponencial(2.5): " + exponencial);

        // Prueba de errores
        try {
            calculadora.dividir(5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            calculadora.tangente(Math.PI / 2); // Tangente de 90 grados (indefinida)
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
