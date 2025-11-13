public class PilaP6{
    private final int MAX=50;
    private int[]elementos;
    private int cima;

    public PilaP6(){
        elementos=new int[MAX];
        cima=-1;
    }
    public boolean estaVacia(){
        return (cima==-1);
    }
    public boolean estaLlena(){
        return (cima==MAX-1);
    }
    public void meter(int x){
        if(!estaLlena()){
            cima++;
            elementos[cima]=x;
        }
    }
    public int sacar(){
        int aux=elementos[cima];
        cima--;
        return aux;
    }
}