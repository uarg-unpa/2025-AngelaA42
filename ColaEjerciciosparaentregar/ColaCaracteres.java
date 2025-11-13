public class ColaCaracteres{
    private final int MAX=10;
    private final char[]elementos=new char[MAX];
    private int ultimo= -1;

    public boolean estaVacia(){
        return ultimo== -1;
    }
    public boolean estaLlena(){
        return ultimo==MAX-1;
    }
    //Agrega al final movible
    public void insertar(char c){
        if(estaLlena()) throw new IllegalStateException("Cola llena");
        elementos[++ultimo]=c;
    }
    //Quito el mas antiguo = frente
    public char borrar(){
        if(estaVacia()) throw new IllegalStateException("Cola vacia");
        char frente=elementos[0];
        for(int i=0; i<ultimo; i++){
            elementos[i]=elementos[i+1];
        }
        ultimo --;
        return frente;
    }
    //Devuelvo el frente sin desencolar, si esta vacia devuelve valor nulo
    public char peek(){
        if(estaVacia()) return '\0';
        return elementos[0];
    }
    //Cantidad actual
    public int tamanio(){
        return ultimo+1;
    }
    //Muestra el contenido
    public String comoTexto(){
        if(estaVacia()) {return "[]";}
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i<ultimo; i++){
            sb.append(elementos[i]);
            if(i<ultimo) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}