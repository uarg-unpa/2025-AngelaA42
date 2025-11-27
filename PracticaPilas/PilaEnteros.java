public class PilaEnteros {
    private int[] elementos;   // Array para almacenar los elementos
    private int cima;          // -1 indica pila vacía
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX]; 
        cima = -1;                 // pila vacía al inicio
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return (cima == -1);
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

    // Agrega un elemento en la cima 
    public void meter(int elem) {
        cima++;                   // avanzo la cima
        elementos[cima] = elem;   // guardo el elemento
    }

    // Saca y devuelve el elemento de la cima
    public int sacar() {
        int aux = elementos[cima]; // tomo el tope
        cima--;                    // bajo la cima
        return aux;                // devuelvo lo que saqué
    }
}