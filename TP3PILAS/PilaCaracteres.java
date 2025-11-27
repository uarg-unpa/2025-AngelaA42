public class PilaCaracteres{
    private char[]elementos;
    private int cima;

    public PilaCaracteres(int capacidad){
        elementos=new char[capacidad];
        cima=-1;
    }
    public boolean estaVacia(){
        return (cima==-1);
    }
    public boolean estaLlena(){
        return(cima==elementos.length-1);
    }
    public void meter(char c){
        cima++;
        elementos[cima]= c;
    }
    public char sacar(){
        char x = elementos[cima];
        cima--;
        return x;
    }
    public char peek(){
        return elementos[cima];
    }
}