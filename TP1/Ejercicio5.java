import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un dia");
        String dia = sc.next();

        switch (dia){
            case "L": 
                   System.out.println("Lunes");
                   break;
            case "M":
                   System.out.println("Martes");
                   break;
            case "I":
                   System.out.println("Hoy tengo resolucion");
                   break;
            case "J":
                   System.out.println("Hoy tengo resolucion");
                   break;
            case "V":
                   System.out.println("Hoy tengo resolucion");
                   break;
            case "S":
                   System.out.println("Sabado");
                   break;
            case "D":
                   System.out.println("Domingo");
                   break;
            default:
                   System.out.println("Dato incorrecto");
        }
    }
}