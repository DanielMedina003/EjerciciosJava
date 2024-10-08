import javax.swing.JOptionPane;
import java.util.Stack;

public class EJ5P {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilaAux = new Stack<>();

        //Tamaño pila
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila"));

        //Llenar pila
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " +(i+1) + " de la pila"));
            pila.push(d);
        }

        //Pila principal
        System.out.println("Pila principal\n" + pila +"\n");    

        //Ordenamos la pila usando otra pila
        while (!pila.isEmpty()) {
            int temp = pila.pop();

            //Si los numeros de la pila auxiliar son mayores se regresan a la pila principal
            while (!pilaAux.isEmpty() && pilaAux.peek() > temp) {
                pila.push(pilaAux.pop());
            }
            pilaAux.push(temp);
        }

        //Regresar los elementos de la pila auxiliar a la pila principal
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());  
        }

        System.out.println("Pila principal ordenada\n" + pila); 
    }

}
