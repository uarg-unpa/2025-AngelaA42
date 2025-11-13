import java.util.Scanner;
public class TestEmpleado{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese datos del empleado");
        System.out.println("Legajo: ");
        int leg = sc.nextInt();

        System.out.println("Sueldo base: ");
        double sueldoB = sc.nextDouble();

        System.out.println("Pago por horas extra: ");
        double pagoHorasE = sc.nextDouble();

        System.out.println("Horas extra realizadas: ");
        int horasExtra = sc.nextInt();

        System.out.println("Casado?: ");
        boolean casado = sc.nextBoolean();

        System.out.println("Hijos?: ");
        int hijos = sc.nextInt();

        Empleado e = new Empleado(leg, sueldoB, pagoHorasE, horasExtra, casado, hijos);

        System.out.println("Datos del empleado");
        System.out.println(e);

        System.out.println("Complemento de horas extra: "+ e.calcularComplementoHorasExtra());
        System.out.println("Sueldo bruto: "+ e.calcularSueldoBruto());
        System.out.println("Retenciones: "+ e.calcularRetenciones());

        sc.close();

        }
}