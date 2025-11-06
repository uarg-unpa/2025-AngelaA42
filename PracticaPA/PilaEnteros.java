public class PilaEnteros {
    private final int MAX = 100;
    private int[] datos;
    private int cima;         

    public PilaEnteros() {
        datos = new int[MAX];
        cima  = -1;
    }

    public boolean estaVacia() { return cima == -1; }
    public boolean estaLlena() { return cima == MAX - 1; }

    public void meter(int x) {        
        cima++;
        datos[cima] = x;
    }

    public int sacar() {              
        int aux = datos[cima];
        cima--;
        return aux;
    }

    public int peek() { return datos[cima]; }

    public int eliminarUnaYContarMovidos(int x) {
        PilaEnteros aux = new PilaEnteros();
        int movidos = 0;
        boolean encontrado = false;

        // saco de esta pila hacia aux hasta hallar x o vaciar
        while (!estaVacia()) {
            int t = sacar();
            if (t == x) {
                encontrado = true;     // x eliminado 
                break;
            } else {
                aux.meter(t);          // lo guardo y cuento como "movido"
                movidos++;
            }
        }
        // si no estaba, restauro y aviso
        if (!encontrado) {
            while (!aux.estaVacia()) {
                meter(aux.sacar());
            }
            return -1; // NO encontrado
        }
        // si estaba, restauro  para conservar el orden original
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }
        return movidos; 
    }
    @Override
    public String toString() {
        if (estaVacia()) return "[]";
        String s = "[";
        for (int i = 0; i <= cima; i++) {
            s += datos[i];
            if (i < cima) s += ", ";
        }
        s += "]";
        return s;
    }
}