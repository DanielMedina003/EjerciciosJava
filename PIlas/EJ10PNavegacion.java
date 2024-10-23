import java.util.Scanner;
import java.util.Stack;

public class EJ10PNavegacion {
    public static void main(String[] args) {
        Stack<String> pilaAtras = new Stack<>();
        Stack<String> pilaAdelante = new Stack<>();  
        String paginaActual = "Inicio";              
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("\nPágina actual: " + paginaActual);
            System.out.println("1. Cargar nueva página");
            System.out.println("2. Atrás");
            System.out.println("3. Adelante");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1: // Cargar una nueva página
                    System.out.print("Ingresa la URL de la nueva página: ");
                    String nuevaPagina = scanner.nextLine();
                    pilaAtras.push(paginaActual);
                    paginaActual = nuevaPagina;    
                    pilaAdelante.clear();           
                    break;

                case 2: // Ir a la página anterior (atrás)
                    if (!pilaAtras.isEmpty()) {
                        pilaAdelante.push(paginaActual);   
                        paginaActual = pilaAtras.pop();    
                    } else {
                        System.out.println("No hay páginas anteriores.");
                    }
                    break;

                case 3: // Ir a la página siguiente (adelante)
                    if (!pilaAdelante.isEmpty()) {
                        pilaAtras.push(paginaActual);      
                        paginaActual = pilaAdelante.pop(); 
                    } else {
                        System.out.println("No hay páginas siguientes.");
                    }
                    break;

                case 4: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);  // Repetir hasta que el usuario elija salir

        scanner.close();
    }
}
