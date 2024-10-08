import javax.swing.JOptionPane;

public class EJ1M {
    public static void main(String[] args) {
        
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];

        //Llenamos la primer matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que va en la posicion" + "["+i+"]" + "["+j+"]" + " de la primer matriz"));
            }
        }

        //Llenamos la segunda matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que va en la posicion" + "["+i+"]" + "["+j+"]" + " de la segunda matriz"));
            }
        }

        int s[][] = new int[3][3];

        //Suma de las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = m1[i][j] + m2[i][j]; 
            }
        }

        //Imprimir resultado 
        System.out.println("\nLa suma de las matrices es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j] + " ");
                
            }
            System.out.println("");
        }


    }
}
