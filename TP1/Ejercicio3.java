import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int valorA, valorB, valorC;

        System.out.println("ingrese un numero: ");
        valorA= sc.nextInt();
        System.out.println("ingrese el segundo valor: ");
        valorB= sc.nextInt();
        System.out.println("ingrese el ultimo valor: ");
        valorC= sc.nextInt();

        System.out.println("valorA= " + valorA + ", valorB= " + valorB + ", valorC= " + valorC);

        valorB=valorA;
        valorC=valorA;
        valorA=3;

        System.out.println("valorA= "+ valorA + ", valorB= " + valorB + ", valorC= " + valorC);
    }
}
