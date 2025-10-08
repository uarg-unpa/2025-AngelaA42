import java.util.Scanner;
public class MenuPila{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();
        int opcion;

        do{
            System.out.println("/n===MENU DE PILA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("4. Verificar estado (vacia/llena)");
            System.out.println()
   