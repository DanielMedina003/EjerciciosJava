import java.util.Stack;

public class Pnto5Parcial {
    public static void main(String[] args) {

                                                         //PUNTO 5)A.
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilaAux = new Stack<>();
    
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(5);
        pila.push(4);
        pila.push(5);
        pila.push(7);

        System.out.println("Pila normal\n" + pila );

        while (!pila.isEmpty()) {
            int n = pila.pop();

            if (!pilaAux.contains(n)) {
                pilaAux.push(n);
            }   
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        System.out.println("\nPila optimizada\n" + pila);

    

    

        


                                                     //PUNTO 5)B.

        /*Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilatemp = new Stack<>();

        int t = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila"));

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que va en la posicion " + (i+1) + " de la pila"));
            pila.push(n);
        }

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero x para eliminar los numeros menores que el"));

        System.out.println("\nPila antes de la verificacion\n" + pila + "\n");

        while (!pila.isEmpty()) {
            int n1 = pila.pop();
            if (n1 >= x) {
                pilatemp.push(n1);
            }
        }

        while (!pilatemp.isEmpty()) {
            pila.push(pilatemp.pop());
        }

        System.out.println("Pila despues de la verificacion\n" + pila + "\n");

        
    }

}
 */
    }

}
