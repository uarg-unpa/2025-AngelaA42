import java.util.Scanner;
public class testProducto{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---CARGA PRODUCTO 1---");
        System.out.println("Nombre: ");
        String nom1 = sc.nextLine();
        System.out.println("Precio: ");
        double precio1 = sc.nextDouble();
        System.out.println("Stock: ");
        int stock1 = sc.nextInt();
        sc.nextLine();

        Producto p1 = new Producto(nom1, precio1, stock1);

        System.out.println("---CARGA PRODUCTO 2---");
        System.out.println("Nombre: ");
        String nom2 = sc.nextLine();
        System.out.println("Precio: ");
        double precio2 = sc.nextDouble();
        System.out.println("Stock: ");
        int stock2 = sc.nextInt();

        Producto p2 = new Producto(nom2, precio2, stock2);

        p2.aumentarStock(10);
        System.out.println("Se aumento el stock del producto 2 en 10 unidades");

        System.out.println("---ESTADO FINAL---");
        System.out.println("Producto 1" + p1);
        System.out.println("Producto 2" + p2);

        System.out.println("Producto con mas stock: ");
        if(p1.tieneMasStockQue(p2)){
            System.out.println("El producto uno tiene mas stock que el producto dos");
        }
        else if(p2.tieneMasStockQue(p1)){
            System.out.println("El producto 2 tiene mas stock que el producto 1");
        }
        else{ System.out.println("Tienen el mismo stock");}
        sc.close();
    }
}