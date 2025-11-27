import java.util.Scanner;
public class TestTeatro{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Carga del teatro");
        System.out.println("Nombre del teatro: ");
        String nomTea = sc.nextLine();
        System.out.println("Direccion: ");
        String dir = sc.nextLine();

        System.out.println("Carga obras del dia");
        System.out.println("Obra 1 - Nombre: ");
        String nom1 = sc.nextLine();
        System.out.println("Obra 1 - Precio: ");
        double pre1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Obra 2 - Nombre: ");
        String nom2 = sc.nextLine();
        System.out.println("Obra 2 - Precio: ");
        double pre2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Obra 3 - Nombre: ");
        String nom3 = sc.nextLine();
        System.out.println("Obra 3 - Precio: ");
        double pre3 = sc.nextDouble();
        sc.nextLine();

        Obra o1 = new Obra(nom1, pre1);
        Obra o2 = new Obra(nom2, pre2);
        Obra o3 = new Obra(nom3, pre3);

        Teatro t = new Teatro(nomTea, dir, o1, o2, o3);

        System.out.println("---Teatro (antes)---");
        System.out.println(t);

        System.out.println("Cambio nombre de teatro: ");
        String nuevoNombreTeatro = sc.nextLine();
        t.setNombre(nuevoNombreTeatro);

        System.out.println("Seleccione obra a modificar (0, 1 o 2): ");
        int idx = sc.nextInt();
        sc.nextLine();

        System.out.println("Nuevo nombre de obra: ");
        String nuevoNombre = sc.nextLine();
        t.cambiarNombreObra(idx, nuevoNombre);

        System.out.println("Nuevo precio de la obra: ");
        double nuevoPrecio = sc.nextDouble();
        sc.nextLine();
        t.cambiarPrecioObra(idx, nuevoPrecio);

        System.out.println("---Teatro (despues)---");
        System.out.println(t);

        sc.close();
        }
}