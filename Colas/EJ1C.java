import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EJ1C {
    public static void main(String[] args) {
        Queue<String> colaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int op;

        do {
            System.out.println("Bienvenido");
            System.out.println("Digite una opción:");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar el siguiente cliente");
            System.out.println("4. Mostrar cuántos clientes quedan");
            System.out.println("5. Vaciar la cola");
            System.out.println("6. Imprimir la cola");
            System.out.println("0. Salir\n");
            op = scanner.nextInt();
            scanner.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("Digite el nombre del cliente:");
                    String nombre = scanner.nextLine();  
                    colaClientes.add(nombre);
                    System.out.println("Cliente " + nombre + " registrado.");
                    break;

                case 2:
                    if (!colaClientes.isEmpty()) {
                        System.out.println("Atendiendo a " + colaClientes.poll());
                    } else {
                        System.out.println("No hay clientes para atender.");
                    }
                    break;

                case 3:
                    if (!colaClientes.isEmpty()) {
                        System.out.println("El siguiente cliente es " + colaClientes.peek());
                    } else {
                        System.out.println("No hay clientes en la cola."); 
                    }
                    break;

                case 4:
                    System.out.println("Quedan " + colaClientes.size() + " clientes en la cola.");
                    break;

                case 5:
                    colaClientes.clear();
                    System.out.println("La cola ha sido vaciada.");
                    break;

                case 6:
                    System.out.println("Clientes en la cola: " + colaClientes);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break; 

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (op != 0);

        scanner.close();
    }
}
