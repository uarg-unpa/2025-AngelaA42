public class ColaCircular{
    private final int MAX=10;
    private int[]elementos;
    private int frente; //el siguiente del primero
    private int ultimo;

    public ColaCircular(){
        elementos = new int[MAX];
        frente=0;
        ultimo=0;
    }
    private int siguiente(int i){ //avanza circularmente.
        if(i==MAX-1) return 0;
        return i+1;
    }
    public boolean estaVacia(){
        return frente==ultimo;
    }
    public boolean estaLlena(){
        return siguiente(ultimo)==frente;
    }
    public void insertar(int x){  //inserta hasta el final.
        ultimo=siguiente(ultimo);
        elementos[ultimo]=x;
    }
    public int borrar(){
        frente=siguiente(frente);
        return elementos[frente];
    }
    @Override
    public String toString(){
        if(estaVacia()) return "Cola(0): []";
        String s = "ColaC: [";
        int i = siguiente(frente);
        while(true){
            s+=elementos[i];
            if(i==ultimo) break;
            s += ", ";
            i=siguiente(i);
        }
        return s+ "]";
    }
}