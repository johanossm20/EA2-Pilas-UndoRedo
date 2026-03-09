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

Compilar:

Ejecutar:

## Autor

Johan