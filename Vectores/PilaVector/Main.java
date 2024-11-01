import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la pila: ");
        int size = scanner.nextInt();
        Pila pila = new Pila(size);

        int opcion;
        do {
            System.out.println("\n--- Menú de la Pila ---");
            System.out.println("1. Apilar elemento");
            System.out.println("2. Desapilar elemento");
            System.out.println("3. Obtener tope de la pila");
            System.out.println("4. Mostrar elementos de la pila");
            System.out.println("5. Verificar si la pila está vacía");
            System.out.println("6. Verificar si la pila está llena");
            System.out.println("7. Obtener tamaño de la pila");
            System.out.println("8. Vaciar pila");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    int elemento = scanner.nextInt();
                    pila.apilar(elemento);
                    break;
                case 2:
                    pila.desapilar();
                    break;
                case 3:
                    System.out.println("El tope de la pila es: " + pila.obtenerTope());
                    break;
                case 4:
                    pila.mostrarElementos();
                    break;
                case 5:
                    System.out.println("¿La pila está vacía? " + pila.estaVacia());
                    break;
                case 6:
                    System.out.println("¿La pila está llena? " + pila.estaLlena());
                    break;
                case 7:
                    System.out.println("Tamaño de la pila: " + pila.obtenerTamano());
                    break;
                case 8:
                    pila.vaciarPila();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        } while (opcion != 9);

     
    }
}