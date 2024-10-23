import javax.swing.JOptionPane;
import java.util.Stack;

public class EJ7P {
    public static void main(String[] args) {
        Stack pila = new Stack<>();

        String cadena = JOptionPane.showInputDialog("Digite una cadena de letras");

        //Se guarda cada caracter en la pila
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));    
        }

        String cadenaInvertida = "";

        //Sacamos cada caracter
        while (!pila.isEmpty()) {
            cadenaInvertida += pila.pop();
        }

        System.out.println("Cadena normal\n" +cadena + "\n");
        System.out.println("Cadena invertida\n" +cadenaInvertida + "\n");
  
    }

}
