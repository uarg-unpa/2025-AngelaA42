import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int nro1, nro2, nro3;

        System.out.println("Ingrese un numero: ");
        nro1=sc.nextInt();
        System.out.println("Ingrese el siguiente numero: ");
        nro2=sc.nextInt();
        System.out.println("Ingrese el ultimo valor: ");
        nro3=sc.nextInt();

        if(nro1>nro2 && nro1>nro3){
            System.out.println("El numero mayor es: " + nro1);
        }
        else  if(nro2>nro1 && nro2>nro3){
            System.out.println("El numero mayor es: " + nro2);
        }
        else
            System.out.println("El numero mayor es: " + nro3);
        
    }
}

