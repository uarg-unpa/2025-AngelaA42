import java.util.Scanner;
public class InvertirPalabra{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        PilaCaracteres pila = new PilaCaracteres(palabra.length());

        for(int i=0; i<palabra.length(); i++){
         pila.meter(palabra.charAt(i));
        }

        String invertida = "";
        while(!pila.estaVacia()){
            invertida = invertida + pila.sacar();
        }
        System.out.println("Invertida: " +invertida);

        sc.close();

    }
}