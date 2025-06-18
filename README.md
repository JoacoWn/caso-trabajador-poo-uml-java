# Evidencia 11: Caso Trabajador v01 (POO, UML, Java)

Este repositorio contiene la resolución de la "Evidencia 11: Caso Trabajador v01", que aborda el modelado y la implementación inicial de un sistema de gestión de trabajadores utilizando Programación Orientada a Objetos (POO), diagramas UML y el lenguaje Java.

## 1. Descripción del Caso

El caso plantea la necesidad de modelar a los trabajadores de una empresa, considerando que:
* Todas las personas (incluidos los trabajadores) tienen un nombre, apellido y un número de RUT.
* Un trabajador, por motivos administrativos, posee una Isapre y una AFP.

Se anticipa la futura necesidad de una interfaz gráfica (JFrame) para la lectura y edición de datos de trabajadores, invocada desde una clase `Principal` con el método `main()`. Se enfatiza que ni la ventana ni las clases del dominio deben gestionar directamente los datos.

## 2. Actividades Desarrolladas

1.  **Modelado UML:** Se ha creado un diagrama de clases UML que representa el contexto descrito, identificando las clases principales (`Persona`, `Trabajador`, `Isapre`, `AFP`) y las relaciones entre ellas (herencia, composición/asociación).
2.  **Estructura de Paquetes:** Las clases están organizadas en paquetes lógicos según su funcionalidad (`clases.dominio`, `clases.ui`, `clases.util`, `test`).
3.  **Implementación en Java:** Se ha generado el esqueleto del código fuente Java a partir del modelo UML, implementando las clases del dominio. Se incluye una clase `Principal` con el método `main()` para demostrar la interacción con una instancia de `Trabajador` (representando la futura interacción con la interfaz de usuario a través de una CLI por ahora).
4.  **Pruebas Unitarias:** Se ha definido un paquete `test` que contiene clases para realizar pruebas unitarias, al menos para la clase `Trabajador`.

## 3. Estructura del Proyecto

caso-trabajador-poo-uml-java/
├── docs/
│   ├── diagrama_clases_caso_trabajador.png  (Imagen del diagrama de clases UML)
│   └── caso_trabajador_v01.vpp              (Archivo del proyecto Visual Paradigm)
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── Walala/                 (Reemplazar 'tu_usuario' por tu nombre de usuario o iniciales)
│                   ├── clases/
│                   │   ├── dominio/
│                   │   │   ├── Persona.java
│                   │   │   ├── Trabajador.java
│                   │   │   ├── Isapre.java
│                   │   │   └── AFP.java
│                   │   ├── ui/
│                   │   │   └── ConsolaTrabajador.java  (Representación CLI de la futura ventana)
│                   │   └── util/
│                   │       └── ValidadorRut.java       (Ejemplo de clase de utilidad para validación)
│                   └── Principal.java
│   └── test/
│       └── java/
│           └── com/
│               └── tu_usuario/                 (Reemplazar 'tu_usuario' por tu nombre de usuario o iniciales)
│                   └── test/
│                       └── TrabajadorTest.java
└── .gitignore
└── pom.xml (Si se usa Maven/Gradle, opcional si es proyecto simple de IDE)
└── README.md

## 4. Diagrama de Clases UML

Puedes encontrar la imagen del diagrama de clases en `docs/diagrama_clases_caso_trabajador.png`.

## 5. Requisitos del Sistema

* Java Development Kit (JDK) 11 o superior.
* Un IDE compatible con Java (IntelliJ IDEA, Eclipse, Apache NetBeans, VS Code).
* Visual Paradigm (para abrir el archivo `.vpp`).

## 6. Cómo Ejecutar

1.  Clona este repositorio:
    `git clone https://github.com/JoacoWn/caso-trabajador-poo-uml-java.git`
2.  Navega al directorio del proyecto:
    `cd caso-trabajador-poo-uml-java`
3.  Abre el proyecto en tu IDE preferido.
4.  Compila y ejecuta la clase `Principal`.

## 7. Notas Adicionales

* La gestión de datos (persistencia) no se ha implementado en esta versión, ya que el caso indica que las clases de dominio y UI no deben gestionarlos directamente.
* La interfaz gráfica (`JFrame`) se ha simulado mediante interacciones por consola (`ConsolaTrabajador`) para cumplir con los requisitos actuales de la entrega.
* Las pruebas unitarias en el paquete `test` son un punto de partida y pueden expandirse para cubrir más escenarios.

---
