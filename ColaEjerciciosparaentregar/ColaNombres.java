public class ColaNombres{
    private final int maxcola = 10;

    private final String[]elementos = new String[maxcola];
    private int frente = 0;
    private int ultimo = 0;

    private int siguiente(int i){
        return (i == maxcola-1) ? 0: i + 1;
    }
    public boolean estaVacia() {return frente == ultimo;}
    public boolean estaLlena() {return siguiente(ultimo) == frente;}

    public void insertar(String nombre){
        if(estaLlena()) throw new IllegalStateException("Cola llena");
        ultimo = siguiente(ultimo);
        elementos[ultimo] = nombre;
    }
    public String borrar(){
        if(estaVacia()) throw new IllegalStateException("Cola vacia");
        frente = siguiente(frente);
        String x = elementos[frente];
        elementos[frente] = null;
        return x;
    }
    public String peek(){
        if(estaVacia()) return null;
        int PosFrente = siguiente(frente);
        return elementos[PosFrente];
    }
    public int tamanio(){
        if(estaVacia()) return 0;
        if(ultimo>=frente) return ultimo-frente;
        return maxcola-frente+ultimo;
    }
    @Override
    public String toString(){
        if(estaVacia()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        int cantidad = tamanio();
        int i = siguiente(frente);
        for(int j=0; j<cantidad; j++){
            sb.append(elementos[i]);
            if(j<cantidad-1) sb.append(",");
            i=siguiente(i);
        }
        sb.append("]");
        return sb.toString();
    }
}