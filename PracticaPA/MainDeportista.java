public class MainDeportista{
    public static void main(String[]args){

        Deportista d1 = new Deportista("Maria",20,"Natacion",110);
        Deportista d2 = new Deportista("Juan",34,"Voley",75);

        System.out.println("---Datos de los deportistas---");
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("¿Quien tiene mas puntos?");
        if(d1.esMasExperimentado(d2)){
            System.out.println(d1.getNombre() + "tiene mas puntos que" + d2.getNombre());
        }else if(d2.esMasExperimentado(d1)) {System.out.println(d2.getNombre() + "tiene mas puntos que" + d1.getNombre());
        }else{ System.out.println("Tienen los mismos puntos"); }

        //¿cuantos son mayores?
        int mayores=0;
        if(d1.esMayorDeEdad()) mayores ++;
        if(d2.esMayorDeEdad()) mayores ++;

        System.out.println("Cantidad de deportistas mayores de dad: " + mayores);
    }
}