/*Descripción: Dada una pila que contiene números enteros y un número X, escribe un programa que elimine todos los 
elementos de la pila que sean menores que x. Al final, la pila debe contener solo los elementos mayores o iguales a x.
Ejemplo si tengo [-2,5,50,6,80,10,100,200] x=150
Resultado [200]
 */

import javax.swing.JOptionPane;
import java.util.Stack;

public class EJ6P {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilatemp = new Stack<>();

        //Tamaño de la pila
        int t = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila"));

        //Llenamos la pila
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que va en la posicion " + (i+1) + " de la pila"));
            pila.push(n);
        }

        //Numero x
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero x para eliminar los numeros menores que el"));

        //Imprimimos píla antes de la verificacion
        System.out.println("\nPila antes de la verificacion\n" + pila + "\n");

        //Verificar si el valor de la pila principal es mayor o igual a 150
        while (!pila.isEmpty()) {
            int n1 = pila.pop();
            if (n1 >= x) {
                pilatemp.push(n1);
            }
        }

        //Llenamos la pila principal con los elementos restantes de la pila temporal
        while (!pilatemp.isEmpty()) {
            pila.push(pilatemp.pop());
        }

        //Imprimimos pila despues de la verificacion
        System.out.println("Pila despues de la verificacion\n" + pila + "\n");

        
    }

}
