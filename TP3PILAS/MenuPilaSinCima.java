import java.util.Scanner;
public class MenuPilaSinCima{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        PilaEnterosSinCima pila = new PilaEnterosSinCima();

        int opcion;
        do{
            System.out.println("---MENU PILA---");
            System.out.println("1. Meter");
            System.out.println("2. Sacar");
            System.out.println("3. Mostrar pila");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

            if(opcion==1){
                if(!pila.estaLlena()){
                    System.out.println("Ingrese un numero: ");
                    int x = sc.nextInt();
                    pila.meter(x);
                    System.out.println("En la pila hay: " +pila.cantidad()+ "Faltan: " +pila.faltanParaMax());
                }else{
                    System.out.println("La pila esta llena (no se puede meter)");
                }
            }else if(opcion == 2){
                if(!pila.estaVacia()){
                    int sacado = pila.sacar();
                    System.out.println("Se saco: " +sacado);
                    System.out.println("Hay: " +pila.cantidad()+ "Faltan para llenar: " +pila.faltanParaMax());
                }else {
                    System.out.println("Pila vacia (no se puede sacar)");
                }
            }else if(opcion == 3){
                System.out.println("Pila: " +pila);
                System.out.println("Hay: "+ pila.cantidad()+ "Faltan para llenar: " +pila.faltanParaMax());
            }else if(opcion == 0){
                System.out.println("Fin");
            }else{
                System.out.println("Opcion invalida");
            }
        }while(opcion != 0);

        //Agregado ver elemento cima sin sacarlo.
        if(!pila.estaVacia()){
            System.out.println("Cima: " +pila.elementoCima());
        }
        System.out.println(pila);

        sc.close();
    }
}

