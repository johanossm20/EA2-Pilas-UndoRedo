import java.util.Scanner;

public class EditorTexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pila pilaAcciones = new Pila(100);
        Pila pilaRedo = new Pila(100);

        int opcion;

        do {

            System.out.println("\n===== EDITOR DE TEXTO =====");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Escriba una línea de texto: ");
                    String texto = scanner.nextLine();

                    pilaAcciones.push(texto);

                    pilaRedo = new Pila(100);

                    break;

                case 2:

                    if (!pilaAcciones.isEmpty()) {

                        String eliminado = pilaAcciones.pop();
                        pilaRedo.push(eliminado);

                        System.out.println("Se deshizo: " + eliminado);

                    } else {

                        System.out.println("No hay acciones para deshacer");

                    }

                    break;

                case 3:

                    if (!pilaRedo.isEmpty()) {

                        String restaurado = pilaRedo.pop();
                        pilaAcciones.push(restaurado);

                        System.out.println("Se rehizo: " + restaurado);

                    } else {

                        System.out.println("No hay acciones para rehacer");

                    }

                    break;

                case 4:

                    System.out.println("\nTexto actual:");
                    pilaAcciones.mostrar();

                    break;

                case 5:

                    System.out.println("Saliendo...");

                    break;

                default:

                    System.out.println("Opción inválida");

            }

        } while (opcion != 5);

        scanner.close();
    }
}