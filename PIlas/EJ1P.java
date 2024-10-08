import javax.swing.JOptionPane;
import java.util.Stack;

public class EJ1P {
    public static void main(String[] args) {
        
        //Se crea la pila 
        Stack<Integer> pila = new Stack<>();
        
        JOptionPane.showMessageDialog(null, "Digite 5 numeros para introducir en la pila");

        //Llenamos la pila
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + (i+1) + " de la pila"));
            pila.push(n);
        }
        
        JOptionPane.showMessageDialog(null, "Los numeros que se ingresaron el la pila son: \n" +pila);
        
    }

}
