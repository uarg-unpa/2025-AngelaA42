public class PilaCharP7{
    private char[]elementos;
    private int cima;

    public PilaCharP7(int capacidad){
        elementos=new char[capacidad];
        cima=-1;
    }
    public boolean estaVacia(){
        return (cima==-1);
    }
    public boolean estaLlena(){
        return (cima==elementos.length-1);
    }
    public void meter(char c){
        if(!estaLlena()){
            cima++;
            elementos[cima]=c;
        }
    }
    public char sacar(){
        char aux = elementos[cima];
        cima--;
        return aux;
    }
}