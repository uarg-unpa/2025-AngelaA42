public class Historial {
    private String[] paginas;
    private int cima;                 
    private final int MAX = 5;

    public Historial() {
        paginas = new String[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        if (cima == -1)
            return true;
        else
            return false;
    }

    public boolean estaLlena() {
        if (cima == MAX - 1)
            return true;
        else
            return false;
    }
    public void meter(String pagina) {
        cima++;
        paginas[cima] = pagina;
    }
    public String sacar() {
        String x = paginas[cima];
        cima--;
        return x;
    }

    // peek (ver la página actual sin sacarla)
    public String verActual() {
        return paginas[cima];
    }

    @Override
    public String toString() {
        return "Pila con " + (cima + 1) + " elemento(s)";
    }
}