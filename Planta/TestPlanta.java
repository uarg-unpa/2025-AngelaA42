import java.util.Scanner;
public class TestPlanta{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese datos de la planta");
        System.out.println("Nombre");
        String nombre = sc.nextLine();

        System.out.println("Nivel de agua (%): ");
        int nivelAgua = sc.nextInt();

        System.out.println("Altura (cm): ");
        int altura = sc.nextInt();
        sc.nextLine();

        System.out.println("Tipo (interior/exterior): ");
        String tipo = sc.nextLine();

        PlantaVirtual p1 = new PlantaVirtual(nombre, nivelAgua, altura, tipo);

        System.out.println("\nDatos de la planta: " + p1);
        System.out.println("Repote: " + p1.reporte());

        sc.close();
    }
}


        