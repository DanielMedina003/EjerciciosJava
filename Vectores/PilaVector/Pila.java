public class Pila {
    private int[] pila;
    private int tope;
    private int maxSize;

    public Pila(int size) {
        maxSize = size;
        pila = new int[maxSize];
        tope = -1;
    }

    public void apilar(int elemento) {
        if (estaLlena()) {
            System.out.println("La pila está llena, no se puede apilar más elementos.");
        } else {
            pila[++tope] = elemento;
            System.out.println("Elemento apilado: " + elemento);
        }
    }

    public void desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía, no se puede desapilar.");
        } else {
            int elemento = pila[tope--];
            System.out.println("Elemento desapilado: " + elemento);
        }
    }

    public int obtenerTope() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return -1;
        } else {
            return pila[tope];
        }
    }

    public void mostrarElementos() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos en la pila:");
            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == maxSize - 1;
    }

    public int obtenerTamano() {
        return tope + 1;
    }

    public void vaciarPila() {
        tope = -1;
        System.out.println("La pila ha sido vaciada.");
    }
}
