public class ColaCaracteres{
    private char[]elementos;
    private int fin;
    private final int MAX=10;

    public ColaCaracteres(){
        elementos=new char[MAX];
        fin=0;
    }
    public boolean estaVacia(){
        return fin==0;
    }
    public boolean estaLlena(){
        return fin==MAX;
    }
    public boolean encolar(char c){
        if(estaLlena()) return false;
        elementos[fin]=c;
        fin++;
        return true;
    }
    public char desencolar(){
        if(estaVacia()) return '\0';
        char primero = elementos[0];
        for(int i=1; i<fin; i++){
            elementos[i-1]=elementos[1];
        }
        fin--;
        return primero;
    }
    public char peek(){
        if(estaVacia()) return '\0';
        return elementos[0];
    }
    public int tamanio(){
        return fin;
    }
    @Override
    public String toString(){
        if(estaVacia()) return "[]";
        String s = "[";
        for(int i=0; i<fin; i++){
            s += elementos[i];
            if(i<fin-1) s += ", ";
        }
        s += "]";
        return s;
    }

}