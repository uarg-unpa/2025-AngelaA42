import java.util.Scanner;
public class MainParesPilaCola{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        PilaP6 p = new PilaP6();
        ColaP6 c= new ColaP6();
        PilaP6 aux = new PilaP6();

        System.out.println("¿Cuantos elementos tendra la pila?");
        int elem = sc.nextInt();
        for(int i=0; i<elem; i++){
            System.out.println("Valor: " + (i+1) + ", ");
            int v = sc.nextInt();
            p.meter(v);
        }
        while(!p.estaVacia()){
            int z = p.sacar();
            if(z%2==0){
                c.insertar(z);
            }else{
                aux.meter(z);
            }
        }
        while(!aux.estaVacia()){
            p.meter(aux.sacar());
        }
        System.out.println("COLA (pares): ");  //mostrar resultado
        while(!c.estaVacia()){
            System.out.println(c.borrar());
        }
        System.out.println("PILA (impares) desde la cima hacia abajo: ");
        while(!p.estaVacia()){
            System.out.println(p.sacar());
        }
        sc.close();
    }
}