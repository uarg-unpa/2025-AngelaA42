import java.util.Scanner;
public class testVehiculo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("CARGA VEHICULO 1");
        System.out.println("Tipo: ");
        String tipo1=sc.nextLine();
        System.out.println("Velocidad Maxima: ");
        int vel1=sc.nextInt();
        System.out.println("Precio: ");
        double precio1=sc.nextDouble();
        sc.nextLine();

        Vehiculo v1 = new Vehiculo(tipo1, vel1, precio1);

        System.out.println("CARGA VEHICULO 2");
        System.out.println("Tipo: ");
        String tipo2=sc.nextLine();
        System.out.println("Velocidad Maxima: ");
        int vel2=sc.nextInt();
        System.out.println("Precio: ");
        double precio2=sc.nextDouble();

        Vehiculo v2 = new Vehiculo(tipo2, vel2, precio2);

        System.out.println("Porcentaje de descuento para v1: ");
        double desc = sc.nextDouble();
        v1.aplicarDescuento(desc);

        v2.aumentarVelocidadMaxima(5);

        System.out.println("---ESTADO FINAL---");
        System.out.println("Vehiculo 1" + v1);
        System.out.println("Vehiculo 2" + v2);

        System.out.println("¿Quien tiene mayor velocidad maxima?");
        if(v1.mayorVelocidad(v2)){
            System.out.println("V1 es mas rapido que V2");
        }
        else if (v2.mayorVelocidad(v1)){
            System.out.println(" V2 es mas rapido que V1");
        }
        else{
            System.out.println("Tienen la misma velocidad maxima");
        }
        sc.close();
    }
}