# Simulador Undo/Redo usando Pilas en Java

## Objetivo

Comprender la estructura de datos pila (Stack) mediante la implementación
de un simulador de deshacer y rehacer acciones en un editor de texto simple.

## Definición de pila

Una pila es una estructura de datos que funciona bajo el principio
LIFO (Last In First Out), lo que significa que el último elemento
que entra es el primero en salir.

Las operaciones principales son:

push() → insertar elemento  
pop() → eliminar elemento  
peek() → ver el elemento superior  
isEmpty() → verificar si está vacía  

## Aplicación en Undo/Redo

Se utilizan dos pilas:

Pila de acciones → guarda el texto escrito.

Pila de redo → guarda las acciones deshechas para poder restaurarlas.

## Funciones del programa

El sistema permite:

- Escribir texto
- Deshacer acciones
- Rehacer acciones
- Mostrar texto actual
- Salir

## Ejecución

Para ejecutar el programa en Java se deben seguir los siguientes pasos:

### 1. Compilar el programa

```
javac Pila.java EditorTexto.java
```

### 2. Ejecutar el programa

```
java EditorTexto
```

## Estructura del proyecto

El proyecto está compuesto por dos clases principales:

Pila.java  
Implementa la estructura de datos pila con las operaciones:
push, pop, peek e isEmpty.

EditorTexto.java  
Contiene el menú interactivo en consola que permite escribir texto,
deshacer acciones, rehacer acciones y mostrar el contenido actual.

## Capturas de ejecución 

<img width="921" height="685" alt="imagen" src="https://github.com/user-attachments/assets/735bded0-9e41-4e1a-813a-b3e113910933" />


<img width="921" height="703" alt="imagen" src="https://github.com/user-attachments/assets/0f7d2e99-4f67-4766-8d15-bc1693854e92" />


## Autor

Johan Andres Ossa 
