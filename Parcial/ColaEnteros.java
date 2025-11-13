public class ColaEnteros{   
    private int[]elementos;
    private final int MAX;
    private int fin;

    public Cola(){ 
        this(10);
    }

    public Cola(int capacidad){  
       this.MAX= capacidad;
       this.elementos = new int[MAX];
       this.fin=-1;
    }

    public boolean estaVacia(){
        return fin==-1;
    }

    public boolean estaLlena(){
        return fin==MAX-1;
    }

    public void insertar(int x){
        if(!estaLlena()){
            fin++;
            elementos[fin]=x;
        }else{
            System.out.println("Cola llena: no se puede insertar");
        }
    }

    public int borrar(){
        if(!estaVacia()){
            int frente=elementos[0];
            for(int i=0; i<fin; i++){
                elementos[i]=elementos[i+1];
            }
            fin--;
            return frente;
        }else{
            System.out.println("Cola vacia, no se puede borrar");
            return -1;
        }
    }
    public int cantidad() { return fin + 1; }

    public boolean masElementos(ColaEnteros q2) {
    
    int n1 = 0;
    int vueltas = this.cantidad();      
    for (int i = 0; i < vueltas; i++) {
        int x = this.borrar();
        n1++;
        this.insertar(x);                  
    }
    int n2 = 0;
    int vueltas2 = q2.cantidad();
    for (int i = 0; i < vueltas2; i++) {
        int y = q2.borrar();
        n2++;
        q2.insertar(y);                    
    }

    return n1 > n2; 
}