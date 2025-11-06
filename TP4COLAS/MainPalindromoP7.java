import java.util.Scanner;
public class MainPalindromoP7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena.");
        String s = sc.nextLine();

        PilaCharP7 pila = new PilaCharP7(s.length());
        ColaCharP7 cola = new ColaCharP7(s.length());

        for(int i=0; i<s.length(); i++){ //cargo ambas a la vez
            char c = s.charAt(i);
            pila.meter(c);
            cola.insertar(c);
        }
        boolean esPalindromo = true;
        while(!pila.estaVacia()){
            char a = pila.sacar();
            char b = cola.borrar();
            if(a != b){
                esPalindromo = false;
                break;
            }
        }
        System.out.println(esPalindromo ? "ES PALINDROMO" : "NO ES PALINDROMO");

        sc.close();
    }
}