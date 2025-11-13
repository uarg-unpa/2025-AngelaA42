public class ColaP6{
    private final int MAX=50;
    private int[]elementos;
    private int cantidad; //final de la cola.

    public ColaP6(){
        elementos = new int[MAX];
        cantidad=0;
    }
    public boolean estaVacia(){
        return (cantidad==0);
    }
    public boolean estaLlena(){
        return (cantidad==MAX);
    }
    public void insertar(int x){
        if(!estaLlena()){
            elementos[cantidad]=x;
            cantidad++;
        }
    }
    public int borrar(){
        int aux = elementos[0];
        for(int i=0; i<cantidad-1; i++){
            elementos[i]=elementos[i+1];
        }
        cantidad--;
        return aux;
    }
}
