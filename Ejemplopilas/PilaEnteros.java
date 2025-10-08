public class PilaEnteros{
    private int[]elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad maxima de la pila
  
    //Constructor: inicializa el array y la cima
    public PilaEnteros(){
        elementos = new int[MAX]; //Crear el array
        cima = -1;
    }

    public boolean estaVacia(){
        if(cima == -1){
          return true;
        }
        else{
          return false;
        }
    }

    public boolean estaLlena(){
        if(cima == MAX - 1){
          return true;
        }
        else{
          return false;
        }
    }
}



