public class PilaAutos{
    private final int MAX = 10;
    private Auto[]elementos;
    private int cima;

    public PilaAutos(){
        elementos = new Auto[MAX];
        cima = -1;
    }
    public boolean estaVacia(){return cima == -1;}
    public boolean estaLlena(){return cima == MAX-1;}

    public void meter(Auto a){
        cima++;
        elementos[cima]=a;
    }
    public Auto sacar(){
        Auto x = elementos[cima];
        cima--;
        return x;
    }
    public Auto buscarYextraerPorPatente(String pat){
        PilaAutos aux = new PilaAutos();
        Auto encontrado = null;

        while(!estaVacia()){
            Auto x = sacar();
            if(encontrado == null && x.getPatente().equals(pat)){
                encontrado = x;
                break;
            }
            else{
                aux.meter(x);
            }
        }
        while(!aux.estaVacia()){
            meter(aux.sacar());
        }
        return encontrado;
    }
    @Override
    public String toString(){
        return "Pila de autos con: " + (cima+1) + "auto(s)";
    }
}