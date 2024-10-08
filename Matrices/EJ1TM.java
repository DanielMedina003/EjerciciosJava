import javax.swing.JOptionPane;

public class EJ1TM {
    public static void main(String[] args) {

        int f,c;

        //Declara tamaño de las filas, columnas de la matriz "z" y tamaños de los vectores "a" y "b"
        f = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de la matriz"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Columnas de la matriz"));
        int z[][]= new int[f][c];

        //Lenamos Matriz
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                z[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero que va en la posicón " + "["+i+"]" + "["+j+"]" + " de la matriz"));
            } 
        }

        //Mostrar matriz
        System.out.println("La matiz que digito es:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println(" ");
        }

        int a[]= new int[f];
        int b[]= new int[c];

        //Suma de filas y columnas
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                a[i] = a[i] + z[i][j];
                b[j] = b[j] + z[i][j];
            }
        }

        System.out.println("\nSuma de las filas");
        for (int i = 0; i < f; i++) {
            System.out.println("F N°" + (i+1) + ": " + a[i]); 
        }

        System.out.println("\nSuma de las columnas");
        for (int j = 0; j < c; j++) {
            System.out.println("C N°" + (j+1) + ": " + b[j]);
        }
        
    }

}
