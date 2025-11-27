public class Cola{   //Frente fijo y final movible.
    private int[]elementos;
    private final int MAX;
    private int fin;

    public Cola(){ // por defecto, tamaño por default
        this(10);
    }

    public Cola(int capacidad){  //capacidad variable.
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
    public int peek(){
        if(!estaVacia()){
            return elementos[0];
        }else{
            System.out.println("Cola vacia, no hay frente");
            return -1;
        }
    }
    //cantidad de elementos en la cola. (punto 3)
    public int cantidad(){
        return fin+1;
    }
    //Agregado (punto 4) quitar los elementos repetidos, manteniendo el orden.
    public void eliminarRepetidos(){
        if(estaVacia()) return ;

        int nuevoFin=-1; //Aca voy dejando los que son unicos.
        for(int i=0; i<=fin; i++){
            int x = elementos[i];
            boolean yaEsta=false;

            for(int j=0; j<=nuevoFin; j++){
                if(elementos[j]==x){
                    yaEsta=true;
                    break;
                }
            }
            if(!yaEsta){  // si no estaba lo agrego a donde estan los unicos
                nuevoFin++;
                elementos[nuevoFin]=x;
            }
        }
        fin=nuevoFin;
    }
    //Agregado (punto 5) comparar dos colas y ver si son iguales(mismo tamaño ymismos elementos)
    public boolean esIdentica(Cola otra){
        if(otra==null) return false;
        if(this.cantidad() != otra.cantidad()) return false;

        Cola aux1 = new Cola(this.MAX);
        Cola aux2 = new Cola(otra.MAX);

        boolean iguales = true;

        while(!this.estaVacia()){
            int x = this.borrar();
            int y = otra.borrar();

            if(x != y) iguales=false;

            aux1.insertar(x);
            aux2.insertar(y);
        }
        while(!aux1.estaVacia()) this.insertar(aux1.borrar());
        while(!aux2.estaVacia()) otra.insertar(aux2.borrar());

        return iguales;

    }

    @Override
    public String toString(){
        String s = "Cola: [";
        for(int i=0; i<=fin; i++){
            s+=elementos[i];
            if(i<fin)s+= ", ";
        }
        return s+ "]";
    }

}