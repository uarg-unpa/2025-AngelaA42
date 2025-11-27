public class CopiarPila{
    private final int MAX = 20;
    private int[]elementos;
    private int cima;

    public CopiarPila(){
        elementos = new int[MAX];
        cima = -1;
    }
    public boolean estaVacia() {return cima == -1;}
    public boolean estaLlena() {return cima == MAX-1;}

    public void meter(int x){
        cima++;
        elementos[cima] = x;
    }
    public int sacar(){
        int aux = elementos[cima];
        cima--;
        return aux;
    }
    @Override
    public String toString(){
        return "Pila con: " + (cima+1) + "elemento(s)";
    }
    public CopiarPila copiar(){
        CopiarPila aux = new CopiarPila();
        CopiarPila copia = new CopiarPila();

        while(!this.estaVacia()){
            aux.meter(this.sacar());   
            }
        while(!aux.estaVacia()){
            int x = aux.sacar();
            this.meter(x);
            copia.meter(x);
        }
        return copia;
    }
}
    
   
