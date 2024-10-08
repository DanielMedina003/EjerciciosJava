//INFIJO A POSTFIJO

import java.util.Stack;

public class EJ4P {

    private static int Operacion(int a, int b, String operador){
        switch (operador) {
            case "+":
            return a+b;

            case "-":
            return a-b;

            case "*":
            return a*b;

            case "/":
            return a/b;
        
            default:
                throw new IllegalArgumentException("OPERADOR DESCONOCIDO, NO PERTMITIDO" + operador);
        }
    }

    public static void main(String[] args) {
        Stack <Integer> pila1 = new Stack<>();
        
        int resultado = 0;
        String expresion = "4,2,*,12,3,/,+,5,-";
        String[] token = expresion.split(",");

        for (int i = 0; i < token.length; i++) {
            if (token[i].equals("+") || token[i].equals("-") || token[i].equals("*") || token[i].equals("/")) {
                int a = pila1.pop();
                int b = pila1.pop();
                resultado = Operacion(b, a, token[i]);
                pila1.push(resultado);
                
            } else {
                pila1.push(Integer.parseInt(token[i]));
                
            }
            
        }
        
        System.out.println(pila1);

    }

}
