class PilaAutosP8 {
    private AutoP8[] datos;
    private int cima;             // -1 vacía
    private final int CAP;

    PilaAutosP8(int capacidad) {
        CAP = capacidad;
        datos = new AutoP8[CAP];
        cima = -1;
    }

    boolean estaVacia() { return cima == -1; }
    boolean estaLlena() { return cima == CAP - 1; }
    int tamaño() { return cima + 1; }

    public void meter(AutoP8 a) {
        cima++;
        datos[cima] = a;
    }

    public AutoP8 sacar() {
        AutoP8 x = datos[cima];
        cima--;
        return x;
    }

    public AutoP8 peek() {return datos[cima]; }

    // ¿La patente está en la pila?
    boolean contiene(String pat) {
        for (int i = 0; i <= cima; i++) {
            if (datos[i].patente.equals(pat)) return true;
        }
        return false;
    }
}