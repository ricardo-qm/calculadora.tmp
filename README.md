# Calculadora Java

Este programa es una calculadora completa que realiza operaciones aritméticas básicas, funciones trigonométricas y funciones exponenciales.

## Funcionalidades

### Operaciones Aritméticas Básicas
- **Suma**: Adición de dos números
- **Resta**: Sustracción de dos números  
- **Multiplicación**: Producto de dos números
- **División**: División de dos números (con manejo de división por cero)

### Funciones Trigonométricas
- **Seno**: Cálculo del seno de un ángulo en radianes
- **Coseno**: Cálculo del coseno de un ángulo en radianes
- **Tangente**: Cálculo de la tangente de un ángulo en radianes (con manejo de valores indefinidos)

### Funciones Exponenciales
- **Exponencial**: Cálculo de e^x (función exponencial natural)

## Estructura del Proyecto

```
calculadora.tmp
├── src
│   ├── main
│   │   └── java
│   │       └── miPrincipal
│   │           ├── App.java
│   │           └── Calculadora.java
│   └── test
│       └── java
│           └── miPrincipal
│               └── AppTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Ejemplos de Uso

### Operaciones Básicas
```java
Calculadora calc = new Calculadora();

// Operaciones aritméticas
double suma = calc.sumar(5, 3);           // 8.0
double resta = calc.restar(5, 3);         // 2.0
double multiplicacion = calc.multiplicar(5, 3); // 15.0
double division = calc.dividir(5, 3);     // 1.666...
```

### Funciones Trigonométricas
```java
// Funciones trigonométricas (ángulos en radianes)
double seno = calc.seno(Math.PI / 2);     // 1.0 (90°)
double coseno = calc.coseno(0);           // 1.0 (0°)
double tangente = calc.tangente(Math.PI / 4); // 1.0 (45°)
```

### Función Exponencial
```java
// Función exponencial
double exp0 = calc.exponencial(0);        // 1.0 (e^0)
double exp1 = calc.exponencial(1);        // 2.718... (e^1 = e)
double expNeg1 = calc.exponencial(-1);    // 0.368... (e^-1)
double exp2 = calc.exponencial(2);        // 7.389... (e^2)
```

## Requisitos
- Java 11 o superior
- Maven

## Manejo de Errores

La calculadora incluye manejo de errores para casos especiales:
- **División por cero**: Lanza `IllegalArgumentException` cuando se intenta dividir por cero
- **Tangente indefinida**: Lanza `IllegalArgumentException` cuando la tangente es indefinida (ej: 90°, 270°)

## Compilación

Para compilar el proyecto, navega al directorio raíz del proyecto y ejecuta el siguiente comando:

```bash
mvn clean install
```

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando:

```bash
mvn exec:java -Dexec.mainClass="miPrincipal.App"
```

La aplicación ejecutará ejemplos de todas las funciones disponibles y mostrará los resultados en la consola.

## Pruebas

El proyecto incluye pruebas unitarias completas para todas las funciones:

- Pruebas para operaciones aritméticas básicas
- Pruebas para funciones trigonométricas
- Pruebas para la función exponencial
- Pruebas para manejo de errores (división por cero, tangente indefinida)

Para ejecutar las pruebas unitarias, utiliza el siguiente comando:

```bash
mvn test
```

### Cobertura de Pruebas
- **10 pruebas unitarias** que cubren todas las funcionalidades
- Validación de resultados con tolerancia apropiada para operaciones de punto flotante
- Verificación del manejo correcto de casos de error

## Descripción de Archivos

### Código Fuente
- **Calculadora.java**: Clase principal que implementa todas las operaciones matemáticas:
  - Operaciones aritméticas básicas (suma, resta, multiplicación, división)
  - Funciones trigonométricas (seno, coseno, tangente)
  - Función exponencial (exponencial)
  - Manejo de errores y casos especiales
- **App.java**: Clase de demostración que muestra ejemplos de uso de todas las funciones de la calculadora

### Pruebas
- **AppTest.java**: Suite completa de pruebas unitarias que valida:
  - Todas las operaciones aritméticas
  - Todas las funciones trigonométricas
  - La función exponencial con múltiples casos de prueba
  - Manejo correcto de errores y excepciones

### Configuración
- **pom.xml**: Archivo de configuración de Maven con dependencias de JUnit para pruebas
- **.gitignore**: Configuración para excluir archivos de construcción y dependencias
- **README.md**: Documentación completa del proyecto

## Nuevas Características

### Función Exponencial ✨
La calculadora ahora incluye la función exponencial que calcula e^x (función exponencial natural):

```java
Calculadora calc = new Calculadora();

// Casos especiales
double resultado1 = calc.exponencial(0);   // 1.0 (e^0 = 1)
double resultado2 = calc.exponencial(1);   // 2.718281828... (e^1 = e)
double resultado3 = calc.exponencial(-1);  // 0.3678794411... (e^-1 = 1/e)

// Otros valores
double resultado4 = calc.exponencial(2);   // 7.3890560989... (e^2)
double resultado5 = calc.exponencial(0.5); // 1.6487212707... (e^0.5)
```

Esta función es especialmente útil para:
- Cálculos de crecimiento exponencial
- Análisis financiero y estadístico
- Aplicaciones en física e ingeniería
- Modelos matemáticos avanzados