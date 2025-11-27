import java.util.Scanner;
public class TestArregloNumeros{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la capacidad del arreglo");
        int capacidad = sc.nextInt();

        ArregloNumeros arr = new ArregloNumeros(capacidad);

        System.out.println("Cntidad de numeros a ingresar: ");
        int cantidad = sc.nextInt();

        for(int i=0 ; i<cantidad ; i++){
            System.out.println(" Numero #" + (i+1) + ":");
            int n = sc.nextInt();
            boolean ok = arr.agregarNumeros(n);
            if(!ok){
                System.out.println("Arrelgo lleno");
                break;
            }
        }
        System.out.println("Numeros cargados: ");
        System.out.println(arr);

        arr.vaciar();
        System.out.println("Despues de vaciar");
        System.out.println(arr);

        sc.close();
    }

}