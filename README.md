# Mi Proyecto Java

Este programa es una calculadora básica que realiza operaciones aritméticas simples como suma, resta, multiplicación y división.



## Estructura del Proyecto

```
mi-proyecto-java
├── src
│   ├── main
│   │   └── java
│   │       └── miPrincipal
│               └── AppTest.java
├── pom.xml
└── README.md
```

## Requisitos

- Java 11 o superior
- Maven

## Compilación

Para compilar el proyecto, navega al directorio raíz del proyecto y ejecuta el siguiente comando:

```
mvn clean install
```

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando:

```
mvn exec:java -Dexec.mainClass="miPrincipal.App"
```

## Pruebas

Para ejecutar las pruebas unitarias, utiliza el siguiente comando:

```
mvn test
```

## Descripción de Archivos

- **App.java**: Clase principal que contiene el método `main` y un mensaje que se imprime en la consola.
- **AppTest.java**: Clase de pruebas que verifica el comportamiento de `App` utilizando JUnit.
- **pom.xml**: Archivo de configuración de Maven que define las dependencias y la configuración del proyecto.