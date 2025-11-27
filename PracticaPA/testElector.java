import java.util.Scanner;
public class testElector{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Elector[] electores = new Elector[5];

        System.out.println("---CARGA 5 ELECTORES---");
        for(int i=0; i<electores.length; i++){
            System.out.println("Elector N°" + (i+1));

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Apellido: ");
            String apellido = sc.nextLine();

            System.out.println("Matricula: ");
            String matricula = sc.nextLine();

            System.out.println("Clse: ");
            int clase = sc.nextInt();
            sc.nextLine();

            System.out.println("Domicilio: ");
            String domicilio = sc.nextLine();

            electores[i] = new Elector(nombre, apellido, matricula, clase, domicilio);
        }
        System.out.println("Electores antes del cambio");
        imprimir(electores);

        if(electores.length >= 3){
            electores[0].setNombre("Maria");
            electores[1].setMatricula("2341");
            electores[2].setDomicilio("San Martin 23");
        }
        System.out.println("Electores despues del cambio");
        imprimir(electores);
        sc.close();
    }

private static void imprimir(Elector[]arr){
            for(Elector e : arr){
                System.out.println(e);
            }
        }
    
}