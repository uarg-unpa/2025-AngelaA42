import java.util.Scanner;
public class testPc{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---CARGA PC1---");
        System.out.println("Marca: ");
        String marca1 = sc.nextLine();
        System.out.println("Procesador: ");
        String proc1 = sc.nextLine();
        System.out.println("Precio: ");
        double precio1 = sc.nextDouble();
        System.out.println("RAM: ");
        int ram1 = sc.nextInt();
        sc.nextLine();

        Pc PC1 = new Pc(marca1, proc1, precio1, ram1);

        System.out.println("---CARGA PC2---");
        System.out.println("Marca: ");
        String marca2 = sc.nextLine();
        System.out.println("Procesador: ");
        String proc2 = sc.nextLine();
        System.out.println("Precio: ");
        double precio2 = sc.nextDouble();
        System.out.println("RAM: ");
        int ram2 = sc.nextInt();

        Pc PC2 = new Pc(marca2, proc2, precio2, ram2);

        System.out.println("Porcentaje de descuento para PC1");
        double desc = sc.nextDouble();
        PC1.aplicarDescuento(desc);

        PC2.actualizarRam(PC2.getRam()+8);

        System.out.println("---INFORMACION FINAL---");
        System.out.println("PC1->" + PC1);
        System.out.println("PC2->" + PC2);

        System.out.println("¿Cual tiene mas RAM?");
        if(PC1.mayorRam(PC2)){
            System.out.println("PC1 tiene mas RAM que PC2");}
            else if (PC2.mayorRam(PC1)){
                System.out.println("PC2 tiene mas RAM que PC1");
            }
            else{System.out.println("Tienen la misma RAM");}
        sc.close();

    }
}