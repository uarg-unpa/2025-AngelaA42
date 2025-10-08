import java.util.Scanner;
public class TestLibro {
    public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Ingrese titulo del libro");
     String titulo = sc.nextLine();
     System.out.println("Ingrese nombre del autor");
     String autor = sc.nextLine();
     System.out.println("Ingrese el año de publicacion");
     int anioPublicacion = sc.nextInt();
     System.out.println("Ingrese la cantidad de paginas");
     int cantidadPaginas = sc.nextInt();

     Libro L1 = new Libro(titulo, autor, anioPublicacion, cantidadPaginas);
     System.out.println(L1);
    }
}


    