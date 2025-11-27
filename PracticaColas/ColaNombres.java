public class ColaNombres {
    private String[] elementos;
    private int frente;     // índice del primer elemento
    private int fin;        // índice donde ENCOLO el próximo
    private int cant;       // cantidad actual
    private final int MAX = 10;

    public ColaNombres() {
        elementos = new String[MAX];
        frente = 0;
        fin = 0;
        cant = 0;
    }

    public boolean estaVacia() { return cant == 0; }
    public boolean estaLlena() { return cant == MAX; }
    public int tamanio()       { return cant; }

    // mueve un índice circularmente
    private int sig(int i) {
        if (i == MAX - 1) return 0;
        return i + 1;
    }

    // Encolar al final lógico (respetando circularidad)
    public boolean encolar(String nombre) {
        if (estaLlena()) return false;
        elementos[fin] = nombre;
        fin = sig(fin);
        cant++;
        return true;
    }

    // Desencolar del frente lógico
    public String desencolar() {
        if (estaVacia()) return null;
        String primero = elementos[frente];
        elementos[frente] = null;   // opcional: “limpiar”
        frente = sig(frente);
        cant--;
        return primero;
    }

    // “peek” mejorado: simula la cola (no expone el arreglo desde afuera)
    public String peek() {
        if (estaVacia()) return null;
        return elementos[frente];
    }

    @Override
    public String toString() {
        if (estaVacia()) return "[]";
        String s = "[";
        int i = frente;
        for (int k = 0; k < cant; k++) {
            s += elementos[i];
            if (k < cant - 1) s += ", ";
            i = sig(i);
        }
        s += "]";
        return s;
    }
}