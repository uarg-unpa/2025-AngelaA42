import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el ultimo valor: ");
        int num3 = sc.nextInt();

        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;

        System.out.println("Suma de enteros: " + suma);
        System.out.println("Producto de enteros: " + producto);
    }
}

class Opcion2{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     int producto = 1;
     int suma = 0;
     int cont = 1;
     System.out.println("Ingrese un numero: ");

     while (cont<=3){
        int num = sc.nextInt();
        suma = suma + num;
        producto = producto * num;
        cont = cont + 1;
     }

     System.out.println("Suma de enteros: " + suma);
     System.out.println("Producto de enteros: " + producto);
    }
}
