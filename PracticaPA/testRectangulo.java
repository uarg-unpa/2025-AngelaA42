import java.util.Scanner;
public class testRectangulo{
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("---RECTANGULO 1---");
    System.out.println("Base: ");
    double b1 = sc.nextDouble();
    System.out.println("Altura: ");
    double a1 = sc.nextDouble();

    Rectangulo r1 = new Rectangulo(b1, a1);

    System.out.println("---RECTANGULO 2---");
    System.out.println("Base: ");
    double b2 = sc.nextDouble();
    System.out.println("Altura: ");
    double a2 = sc.nextDouble();

    Rectangulo r2 = new Rectangulo(b2, a2);

    System.out.println("Area del rectangulo 1: " + r1.calcularArea());
    System.out.println("Perimetro del rectangulo 2: " + r2.calcularPerimetro());

    if(r1.esMayorElArea(r2)){
        System.out.println("r1 tiene mayor area que r2");
    }
    else if(r2.esMayorElArea(r1)){
        System.out.println("r2 tiene mayor area que r1");
    }
    else {System.out.println("r1 y r2 tienen el mismo area");}
    sc.close();
}
}

