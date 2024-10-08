public class EJ3M {
    public static void main(String[] args) {

        int m[][] = new int[7][7];

        //Llenamos la diagonal principal con el numero 1
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 1;
        }

        //Imprimimops la matriz
        System.out.println("n\nMatriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        
    }

}
