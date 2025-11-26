//2) Sumar los digitos de un número entero
import java.util.Scanner;
public class SumarDigitos{

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
         
        System.out.println("Ingrese número entero: ");   
        int numero = sc.nextInt();      
        
        System.out.println("Suma de Digitos:" + sumaDigitos(numero));
    }
     
    public static int sumaDigitos(int numero){
      
      if (numero < 10) // caso base
         return numero;
      else{            // caso general
         return sumaDigitos(numero/10) + (numero%10);
      }           
    }
}