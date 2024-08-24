# Desafíos Resueltos - Prueba Técnica Programador Jr.

¡Bienvenido! Este repositorio contiene las soluciones a los retos planteados en la prueba técnica para el puesto de Programador Jr. en JITKey. A continuación, se detallan los dos desafíos que se resolvieron.

## Descripción de los Retos

### RETO 1: Recortes de Revista

**Descripción**:  
Deseamos escribir un informe utilizando recortes de una revista publicada. Antes de proceder, necesitamos saber si es posible escribir dicho informe con el texto de la revista disponible.

**Instrucciones**:
- Escribe una función en Java que reciba como entrada dos cadenas de caracteres:
    1. La primera cadena será la nota que deseamos escribir.
    2. La segunda cadena será el texto completo de la revista.

- La función debe determinar si la nota puede ser escrita utilizando solo el texto de la revista dada.

**Consideraciones**:
- Explica cómo tu función determinará la respuesta en términos de la longitud del informe (n) y de la revista (m).

### RETO 2: Notificación a Estudiantes

**Descripción**:  
Necesitamos notificar a los estudiantes sobre una incidencia que afecta a dos asignaturas en la sede ubicada en Málaga, lo que resulta en la cancelación de las clases programadas para el siguiente día.

**Instrucciones**:
- Disponemos de tres listas de estudiantes matriculados en cada asignatura:
    1. **Lista A**: Nombres de estudiantes matriculados en Matemáticas (de todas las sedes).
    2. **Lista B**: Nombres de estudiantes matriculados en Francés (de todas las sedes).
    3. **Lista C**: Nombres de estudiantes matriculados en ambas asignaturas, Matemáticas y Francés (de todas las sedes).

- Escribe una función en Java para notificar a los estudiantes afectados, asegurando que cada uno reciba solo un correo electrónico y que los correos enviados a cada lista sean diferentes.

**Información Adicional**:
- De cada estudiante se conoce su nombre y la sede donde está matriculado.

## Plazo de Entrega

Por favor, envía tus soluciones en un plazo máximo de 48 horas desde la recepción de este desafío.

## Estructura del Repositorio

```plaintext
PruebaTecnica-ProgramadorFullStack-Eficiempresarial
├── .idea
│   └── (contenido no visible)
├── bin
│   └── (contenido no visible)
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.challenge.fullstack
│   │   │       ├── org.example
│   │   │       │    ├── FirstChallenge.java
│   │   │       │    └── SecondChallenge.java
│   │   └── resources 
│   └── test 
│       ├── java 
│       │   └── com.challenge.fullstack 
│       │       ├── org.example 
│       │       │   ├── FirstChallengeTest.java 
│       │       │   └── SecondChallengeTest.java 
│       └── resources  
├── target  
│   └── (contenido no visible)  
├── pom.xml  
