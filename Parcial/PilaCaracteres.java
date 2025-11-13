public class PilaEnteros {
    private int[] elementos;   
    private int cima;          
    private final int MAX = 10; 

    
    public PilaEnteros() {
        elementos = new int[MAX]; 
        cima = -1;                 
    }

  
    public boolean estaVacia() {
        return (cima == -1);
    }

    
    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

     
    public void meter(int elem) {
        cima++;                   
        elementos[cima] = elem; 
    }

    
    public int sacar() {
        int aux = elementos[cima]; 
        cima--;                   
        return aux;                
    }

    int cantVocales = 0;
    PilaCaracteres aux = new PilaCaracteres();  

while (!p.estaVacia()) {
    char c = p.sacar();
    if (esVocal(c)) cantVocales++;
    aux.meter(c);
}
while (!aux.estaVacia()) {
    p.meter(aux.sacar());
}
System.out.println("Cantidad de vocales: " + cantVocales);

static boolean esVocal(char c) {
    c = Character.toLowerCase(c);
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
}