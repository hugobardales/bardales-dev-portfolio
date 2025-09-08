# ☕ Máquina de Café Virtual: Demostración de Principios de POO en Java

## Resumen del Proyecto

Este proyecto es una simulación de una máquina de café en línea de comandos, desarrollada en Java. Más allá de su funcionalidad básica, este repositorio sirve como una demostración práctica y detallada de los **pilares de la Programación Orientada a Objetos (POO)**. Ha sido estructurado para mostrar no solo el resultado final, sino también las decisiones de diseño arquitectónico que reflejan un entendimiento de los principios de software limpio y escalable.



---

## Objetivos del Proyecto

El propósito principal de este software es servir como pieza de portafolio para demostrar las siguientes competencias técnicas:

* **Aplicación de los Pilares de la POO**: Demostrar un uso práctico de la **Herencia**, el **Polimorfismo** y el **Encapsulamiento**.
* **Diseño de Software Extensible**: Crear una base de código que pueda ser fácilmente extendida para incluir nuevos tipos de café con un mínimo de modificaciones.
* **Código Limpio y Legible**: Escribir código auto-documentado y seguir las convenciones de Java para facilitar su mantenimiento y revisión.
* **Manejo de Lógica de Aplicación**: Estructurar la interacción con el usuario y la lógica de negocio de una manera clara y organizada.

---

## Stack Tecnológico

* **Lenguaje**: Java (JDK 11+)
* **Entorno de Ejecución**: Java Virtual Machine (JVM)
* **Herramientas de Construcción**: Compilador `javac` (compatible con Maven/Gradle para futura expansión).

---

## Análisis Arquitectónico y Decisiones de Diseño

Esta sección detalla las decisiones de diseño que estructuran el proyecto, demostrando un entendimiento de los patrones de la POO.

### 1. La Superclase `Coffee`: Un Fundamento para la Extensibilidad

La clase `Coffee` actúa como la **clase padre** (o superclase) abstracta del sistema. Fue diseñada para encapsular todos los atributos y comportamientos comunes a cualquier tipo de café.

* **Atributos Comunes**: `name`, `roast`, `price`. Estos son compartidos por todas las bebidas, promoviendo la reutilización de código.
* **Métodos Comunes**: Proporciona implementaciones base para `grindBeans()`, `brewCoffee()`, y `printInfo()`, que pueden ser utilizadas o especializadas por las clases hijas.

### 2. Herencia: El Principio "Es un" (`Is-A`)

Las clases `Espresso` y `Latte` **heredan** de `Coffee`, siguiendo una relación lógica "Es un":
* Un `Espresso` **es un** tipo de `Coffee`.
* Un `Latte` **es un** tipo de `Coffee`.

Esto permite que ambas clases hijas reutilicen automáticamente la funcionalidad de `Coffee` y sean tratadas polimórficamente.

### 3. Polimorfismo y Sobrescritura de Métodos (`@Override`)

El polimorfismo es el pilar más visible en este proyecto. Las clases `Espresso` y `Latte` **sobrescriben** métodos de la clase `Coffee` para proveer un comportamiento especializado.

* **`brewCoffee()`**: Mientras que `Coffee` define un mensaje genérico, `Latte` sobrescribe este método para incluir pasos adicionales como añadir sirope y vaporizar leche, demostrando cómo un mismo método puede tener diferentes implementaciones.
* **`printInfo()`**: Ambas clases hijas llaman a `super.printInfo()` para ejecutar primero la lógica de la clase padre (imprimir nombre, tueste, etc.) y luego añaden su propia información específica (cantidad de shots, tipo de leche, costo total calculado). Esto demuestra una reutilización de código eficiente.

### Diagrama de Clases (UML)

El siguiente diagrama UML ilustra la relación entre las clases del sistema:

```mermaid
classDiagram
    Coffee <|-- Espresso
    Coffee <|-- Latte
    CoffeeMachine ..> Espresso : crea
    CoffeeMachine ..> Latte : crea

    class Coffee{
        <<Abstract>>
        # String name
        # String roast
        # double price
        + grindBeans()
        + brewCoffee()
        + printInfo()
    }
    class Espresso{
        - int numberOfShots
        + brewCoffee()
        + printInfo()
    }
    class Latte{
        - String milkType
        - String syrupFlavor
        + brewCoffee()
        + printInfo()
    }
    class CoffeeMachine{
        + static main(String[] args)
    }