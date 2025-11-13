import java.util.Scanner;
public class TestPersona{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese datos de la persona");
    System.out.println("Nombre: ");
    String nom = sc.nextLine();

    System.out.println("Edad: ");
    int edad = sc.nextInt();

    System.out.println("D.N.I: ");
    int dni = sc.nextInt();
    sc.nextLine();

    System.out.println("Sexo (H/M): ");
    char sexo = sc.next().charAt(0);

    System.out.println("Peso (Kg): ");
    double peso = sc.nextDouble();

    System.out.println("Altura: ");
    double alt = sc.nextDouble();

    Persona p1 = new Persona();
    p1.setNombre(nom);
    p1.setEdad(edad);
    p1.setDni(dni);
    p1.setSexo(sexo);
    p1.setPeso(peso);
    p1.setAltura(alt);

    System.out.println("Datos de la persona");
    System.out.println(p1);

    sc.close();
  }
}