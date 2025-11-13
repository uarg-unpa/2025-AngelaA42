import java.util.Scanner;
public class TestAlumno{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Ingrese datos del primer alumno");
        System.out.println("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("Edad: ");
        int edad1 = sc.nextInt();
        System.out.println("Legajo: ");
        int legajo1 = sc.nextInt();
        sc.nextLine();
        Ejercicio2Alumno a1 = new Ejercicio2Alumno(nombre1, edad1, legajo1);

        System.out.println("Ingrese los datos del siguiente alumno");
        System.out.println("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println("Edad: ");
        int edad2 = sc.nextInt();
        System.out.println("Legajo: ");
        int legajo2 = sc.nextInt();
        Ejercicio2Alumno a2 = new Ejercicio2Alumno(nombre2, edad2, legajo2);

        System.out.println("Datos del primer alumno");
        System.out.println(a1);

        System.out.println("Datos del segundo alumno");
        System.out.println(a2);

        sc.close();
    }
}









