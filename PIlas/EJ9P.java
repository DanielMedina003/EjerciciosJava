/*Verificar Expresiones Balanceadas 

Descripción: Crear un programa que verifique si una expresión matemática que incluye paréntesis, corchetes y llaves está balanceada. 
Los alumnos deberán utilizar una pila para resolver este problema. Requisitos:
La entrada será una cadena que puede contener paréntesis (), corchetes [], y llaves {}. El programa deberá devolver true si la expresión 
está balanceada y false si no lo está. 
Ejemplo:

Entrada: {[0]} Salida: true
Entrada: {[(])}
Salida: false */

import java.util.Scanner;
import java.util.Stack;

public class EJ9P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una expresión: ");
        String expresion = scanner.nextLine();

        boolean estaBalanceada = verificarBalance(expresion);
        System.out.println("La expresión está balanceada: " + estaBalanceada);
    }

    public static boolean verificarBalance(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false; // Hay un cierre sin apertura
                }

                char top = pila.pop();
                if (!esPar(validoPar(top, caracter))) {
                    return false; // No coinciden los pares
                }
            }
        }
        return pila.isEmpty(); // Verifica si quedaron elementos sin cerrar
    }

    public static boolean validoPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }

    public static boolean esPar(boolean valido) {
        return valido;
    }
}
