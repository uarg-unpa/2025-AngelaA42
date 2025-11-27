import java.util.Scanner;
public class PruebaVehiculo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese datos del vehiculo");
        System.out.println("Tipo de vehiculo: ");
        String tipo = sc.nextLine();

        System.out.println("Velocidad maxima del vehiculo: ");
        int velocidadMaxima = sc.nextInt();

        System.out.println("Precio del vehiculo: ");
        double precio = sc.nextDouble();

        Vehiculo v1 = new Vehiculo(tipo, velocidadMaxima, precio);
        Vehiculo v2 = new Vehiculo(tipo, velocidadMaxima, precio);

        System.out.println("Datos del primer vehiculo");
        System.out.println(v1);

        System.out.println("Datos del segundo vehiculo");
        System.out.println(v2);

        sc.close();
    }
}
