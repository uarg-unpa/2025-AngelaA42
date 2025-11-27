import java.util.Scanner;
public class TestPilaAutos{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        PilaAutos pila = new PilaAutos();

        System.out.println("¿Cuantos autos se van a cargar? (maximo 10): ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            if(pila.estaLlena()){
                System.out.println("La pila esta llena");
                break;
            }
            System.out.println("Auto # " + (i+1));
            System.out.println("Patente: ");
            String patente = sc.nextLine();
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Año: ");
            int anio = sc.nextInt();
            sc.nextLine();

            pila.meter(new Auto(patente, marca, modelo, anio));
        }
        System.out.println(" " + pila);

        System.out.println("Ingrese patente a buscar para extraer: ");
        String buscado = sc.nextLine();

        Auto sacado = pila.buscarYextraerPorPatente(buscado);
        if(sacado != null){
            System.out.println("Se encontro y se saco: " + sacado);
        }else{
            System.out.println("No se encontro la patente dentro de la pila.");
        }
        System.out.println("Estado final->  " + pila);

        sc.close();
    }
}