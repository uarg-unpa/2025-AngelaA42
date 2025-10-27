import java.util.Scanner;
public class TestEstacion{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("===Estacion de servicio===");
        System.out.println("Stock inicial (L): ");
        double stockInicial = sc.nextDouble();

        EstacionServicio est = new EstacionServicio(stockInicial);

        System.out.println("Litros a cargar: ");
        double car = sc.nextDouble();
        est.cargar(car);

        System.out.println("Litros a reponer: ");
        double rep = sc.nextDouble();
        est.reponer(rep);

        System.out.println("Estado de la estacion de servicio");
        System.out.println(est);

        sc.close();
    }
}