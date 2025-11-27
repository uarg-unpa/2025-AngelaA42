public class PilaEnterosSinCima{
    private final int MAX = 10;
    private int[]elementos;
    private int usados;

    public PilaEnterosSinCima(){
        elementos=new int[MAX];
        usados=0;
    }
    public boolean estaVacia() {return usados==0;}
    public boolean estaLlena() {return usados==MAX;}

    public void meter(int x){
        elementos[usados]= x;
        usados++;
    }
    public int sacar(){
        usados--;
        return elementos[usados];
    }
    public int cantidad(){return usados;}
    public int capacidad(){return MAX;}
    public int faltanParaMax(){return MAX-usados;}

    //Agegar metodo elementoCima() que retorne el elemento cima sin cambiar la pila.
    public int elementoCima(){
        return elementos[usados-1];
    }

    @Override
    public String toString(){
        return "Pila con: "+usados+"elemento(s)";
    }
}