package miPrincipal;

public class Calculadora {
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double seno(double angulo) {
        return Math.sin(angulo);
    }

    public double coseno(double angulo) {
        return Math.cos(angulo);
    }

    public double tangente(double angulo) {
        double coseno = Math.cos(angulo);
        if (Math.abs(coseno) < TOLERANCE) {
            throw new IllegalArgumentException("Tangente indefinida para este ángulo");
        }
        return Math.tan(angulo);
    }

    public double exponencial(double a){
        double resultado = Math.exp(a);
        return  resultado;
    }
}
