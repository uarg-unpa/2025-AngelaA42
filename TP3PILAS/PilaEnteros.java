public class PilaEnteros{
    private final int MAX = 20;
    private int[]elementos;
    private int cima;

    public PilaEnteros(){
        elementos = new int[MAX];
        cima = -1;
    }
    public boolean estaVacia(){return cima==-1;}
    public boolean estaLlnea(){return cima==MAX-1;}

    public void meter(int x){
        cima++;
        elementos[cima]=x;
    }
    public int sacar(){
        int aux = elementos[cima];
        cima--;
        return aux;
    }
    public int elementoCima(){
        return elementos[cima];
    }
    public int capacidad(){return cima+1;}

    //a) segundo desde arriba, dejando la pila sin sus dos elementos superiores.
    public static int segundoSacandoDos(PilaEnteros p){
        int primero = p.sacar();
        int x = p.sacar();
        return x;
    }
    //b) segundo desde arriba, sin modificar la pila.
    public static int segundoSinModificar(PilaEnteros p){
        PilaEnteros aux = new PilaEnteros();

        int a = p.sacar();
        aux.meter(a);
        int x = p.sacar();
        aux.meter(x);

        while(!aux.estaVacia()){
            p.meter(aux.sacar());
        }
        return x;
    }
    //c) N-esimo desde arriba, dejando la pila sin los n elementos superiores.
    public static int nEsimoSacandoN(PilaEnteros p, int n){
        int x = 0;
        for (int i=1; i<=n; i++){
            x = p.sacar();
        }
        return x;
    }
    //d) N-esimo desde arriba, sin modificar la pila.
    public static int nEsimoSinModificar(PilaEnteros p, int n){
        PilaEnteros aux = new PilaEnteros();

        for(int i=1; i<=n; i++){
            aux.meter(p.sacar());
        }
        int x = aux.sacar();
        aux.meter(x);
        while(!aux.estaVacia()){
            p.meter(aux.sacar());
        }
        return x;
    }
    //e) elemento del fondo, dejando la pila vacia.
    public static int fondoDejandoVacia(PilaEnteros p){
        PilaEnteros aux = new PilaEnteros();
        while(!p.estaVacia()) aux.meter(p.sacar());
        int x = aux.sacar();
        return x;
    }
    //f)elemento del fondo sin modificar la pila.
    public static int fondoSinModificar(PilaEnteros p){
        PilaEnteros aux1 = new PilaEnteros();
        PilaEnteros aux2 = new PilaEnteros();
        while(!p.estaVacia()) aux1.meter(p.sacar());

        int x = aux1.sacar();

        while(!aux1.estaVacia()) p.meter(aux1.sacar());

        while(!p.estaVacia()) aux2.meter(p.sacar());
        p.meter(x);
        while(!aux2.estaVacia()) p.meter(aux2.sacar());

        return x;
    }
    @Override
    public String toString(){
        return "Pila con: " + (cima+1) + "elemento(s)";
    }
}