// Clase que implementa la estructura de datos Pila
public class Pila {

    private String[] elementos;
    private int tope;

    public Pila(int tamaño) {
        elementos = new String[tamaño];
        tope = -1;
    }

    // push(): agrega un elemento
    public void push(String valor) {
        if (tope < elementos.length - 1) {
            tope++;
            elementos[tope] = valor;
        } else {
            System.out.println("La pila está llena");
        }
    }

    // pop(): elimina el último elemento
    public String pop() {
        if (!isEmpty()) {
            String valor = elementos[tope];
            tope--;
            return valor;
        }
        return null;
    }

    // peek(): muestra el último elemento
    public String peek() {
        if (!isEmpty()) {
            return elementos[tope];
        }
        return null;
    }

    // verifica si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // mostrar contenido
    public void mostrar() {

        if (isEmpty()) {
            System.out.println("No hay texto.");
        }

        for (int i = 0; i <= tope; i++) {
            System.out.println(elementos[i]);
        }
    }
}