public class MainAuto{
    public static void main(String[]args){

        Auto a1 = new Auto("Ford","Fiesta",2010,180);
        Auto a2 = new Auto("Chevrolet","Corsa",1998,170);
        Auto a3 = new Auto("BMW","M3",2005,250);

        System.out.println("---Mostrar datos---");
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();

        System.out.println("¿Cual es el mas rapido?");
        Auto masRapido = a1;
        if(a2.esMasRapidoQue(masRapido)){masRapido = a2;}
        if(a3.esMasRapidoQue(masRapido)){masRapido = a3;}
        System.out.println();
        System.out.println("El auto mas rapido es: ");
        masRapido.mostrarInfo();

        System.out.println("Autos clasicos");
        if (a1.esAutoClasico()) {
            a1.mostrarInfo();
        }
        if (a2.esAutoClasico()) {
            a2.mostrarInfo();
        }
        if (a3.esAutoClasico()) {
            a3.mostrarInfo();
        }
    }
}