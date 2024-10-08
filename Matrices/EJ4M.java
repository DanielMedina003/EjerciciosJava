import java.util.Scanner;

public class EJ4M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double m[][] = new Double[4][4], s = 0.0;

        //Cargar la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite la notas del alumno numero " + (i+1));
                m[i][j] = scanner.nextDouble();
                s += m[i][j];
            }
            m[i][3] = s/3;
            s = 0.0;
        }

        //Mostrar matriz
        for (int i = 0; i < 4; i++) {
            System.out.println("Notas del alumno numero " + (i+1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota N°" + (j+1) + ": " + m[i][j]);
            }
            System.out.println("El promedio de las notas es: " + m[i][3] + "\n");
        }


    }

}

