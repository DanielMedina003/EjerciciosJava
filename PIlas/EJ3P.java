import java.util.Stack;
import javax.swing.JOptionPane;

public class EJ3P {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        //Cantidad de caracteres a ingresar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de caracteres que va a ingresar"));

        //LLenar pila
        for (int i = 0; i < n; i++) {

            String c;
           
            //Validacion, unicamente caracteres que sean letras
            do {
                
                c = JOptionPane.showInputDialog("Digite el caracter " + (i+1) + " de la pila");

                if (c.length() != 1 || Character.isDigit(c.charAt(0))) {
                    JOptionPane.showMessageDialog(null, "Ingrese un caracter que no sea un numero");
                }
                
            } while (c.length() != 1 || Character.isDigit(c.charAt(0)));
            pila.push(c);
        }

        System.out.println(pila);

          // Formar la cadena invertida a partir de la pila
          StringBuilder pilainvertida = new StringBuilder();
          pilainvertida.append("[");
          while (!pila.isEmpty()) {

              pilainvertida.append(pila.pop());  // Sacar los caracteres de la pila (en orden inverso)

              if (!pila.isEmpty()) {
                pilainvertida.append(", ");  
            }
          }

          pilainvertida.append("]");
          
          // También imprimirla en consola si es necesario
          System.out.println("Cadena invertida: " + pilainvertida.toString());
    }
}
