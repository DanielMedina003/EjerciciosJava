import java.util.Scanner;
import java.util.Stack;

public class EJ8P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> acciones = new Stack<>();
        boolean salir = false;

        while (!salir) {
            
            System.out.println("\nElija una opcion:\n 1. Agregar una accion\n 2. Deshacer ultima accion\n" +
            " 3. Mostrar historial de acciones\n 4. Salir\n");
            int opcion = scanner.nextInt();
            scanner.nextLine();            

            switch (opcion) {
                case 1:
                    System.out.println("\nEscribe la accion");
                    String accion = scanner.nextLine();
                    acciones.push(accion);
                    break;
                
                case 2:
                    if (acciones.isEmpty()) {
                        System.out.println("\nNo hay acciones para eliminar");
                    } else {
                        String accioneEliminada = acciones.pop();
                        System.out.println("\nSe elimino la accion " + accioneEliminada);
                    }
                    break;
                  
                case 3:
                    if (acciones.isEmpty()) {
                        System.out.println("\nNo hay acciones");
                    } else {
                        for (String a : acciones) {
                            System.out.println("Historial de acciones: \n" + a);
                        }
                    }    
                    break;

                case 4:
                    salir = true;
                    System.out.println("\nSaliendo...\n");
                    break;    
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
        }

        scanner.close();
        
    }

}
