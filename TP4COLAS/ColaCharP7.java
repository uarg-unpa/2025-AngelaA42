public class ColaCharP7{
    private char[]datos;
    private int cantidad;
    private final int MAX;

    public ColaCharP7(int capacidad){
        MAX=capacidad;
        datos=new char[MAX];
        cantidad=0;
    }
    public boolean estaVacia() {return cantidad==0;}
    public boolean estaLlena() {return cantidad==MAX;}

    public void insertar(char c){
        if(!estaLlena()){
            datos[cantidad]=c;
            cantidad++;
        }
    }
    public char borrar(){
        char primero = datos[0];
        for(int i=0; i<cantidad-1; i++){
            datos[i]=datos[i+1];
        }
        cantidad--;
        return primero;
    }
}