import java.util.Scanner;
public class TestArticulo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---Datos del articulo---");
        System.out.println("Descripcion: ");
        String desc = sc.nextLine();

        System.out.println("Precio: ");
        double pre = sc.nextDouble();
        sc.nextLine();

        System.out.println("Codigo: ");
        String cod = sc.nextLine();

        System.out.println("Stock inicial: ");
        int stock = sc.nextInt();

        Articulo a = new Articulo(desc, pre, cod, stock);

        System.out.println("---Datos iniciales del articulo---");
        System.out.println(a);

        System.out.println("Cantidad a incrementar: ");
        int inc = sc.nextInt();
        a.incrementarStock(inc);

        System.out.println("Cantidad a decrementar: ");
        int dec = sc.nextInt();
        a.decrementarStock(dec);

        System.out.println("---Datos actualizados del articulo---");
        System.out.println(a);

        sc.close();
    }
}