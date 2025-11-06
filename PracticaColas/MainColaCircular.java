import java.util.Scanner;
public class MainColaCircular{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        ColaCircular cola = new ColaCircular();
        int opcion;

        do{
            System.out.println("1) Insertar.  2) Borrar.  3) Ver.  4) Salir. ");
            opcion = sc.nextInt();
            if(opcion==1){
                if(cola.estaLlena()){ System.out.println("LLENA.");}
                else{
                    System.out.println("Numero: ");
                    cola.insertar(sc.nextInt());}
            }else if(opcion==2){
                    if(cola.estaVacia()) System.out.println("VACIA.");
                    else System.out.println("Salio: " + cola.borrar());
                }else if(opcion==3){
                    System.out.println(cola);
                }
        }while(opcion != 0);

        sc.close();
    }
}