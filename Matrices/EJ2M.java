import javax.swing.JOptionPane;

public class EJ2M {
    public static void main(String[] args) {

        int m[][] = new int[3][3];


        //Llenamos la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que va en la posicón " + "["+i+"]" + "["+j+"]" + " de la matriz"));
            }
        }

        //Mostramos la matriz
        System.out.println("\nMatriz Oirginal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println( "");
        }

        //Proceso para transponer la matriz
        int aux; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = aux;
            }
        }
        
        //Mostrar matriz transpuesta
        System.out.println("\nMatriz Transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }




        
    }

}
