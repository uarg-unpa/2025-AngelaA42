class ColaEnteros {
    private final int MAX = 100;
    private int[] elementos;
    private int fin;                 //MAX-1: última posición usada

    public ColaEnteros() {
        elementos = new int[MAX];
        fin = -1;
    }

    public boolean estaVacia() { return fin == -1; }
    public boolean estaLlena() { return fin == MAX - 1; }

    // Encolar (insertar al final)
    public void insertar(int x) {
        fin++;
        elementos[fin] = x;
    }
    public int borrar() {
        int primero = elementos[0];
        for (int i = 0; i < fin; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return primero;
    }
    public int peek() { return elementos[0]; }

    // Cantidad actual
    public int cantidad() { return fin + 1; }

    @Override
    public String toString() {
        if (estaVacia()) return "[]";
        String s = "[";
        for (int i = 0; i <= fin; i++) {
            s += elementos[i];
            if (i < fin) s += ", ";
        }
        s += "]";
        return s;
    }
}