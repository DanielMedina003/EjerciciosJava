import javax.swing.JOptionPane;
import java.util.Stack;

public class EJ2P {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        String r;

        do {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            pila.push(n);
            
            r = JOptionPane.showInputDialog("¿Desea ingresar otro numero? si/no");

        } while (r.equalsIgnoreCase("si"));

        JOptionPane.showMessageDialog(null, "Los numeros que se ingresaron el la pila son: \n" +pila);
        
    }

}
