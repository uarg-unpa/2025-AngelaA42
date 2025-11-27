public class Empresa{
    public static void main(String[]args){

        Empleado e1 = new Empleado("Maria", 1023, 370000);
        Empleado e2 = new Empleado("Ana", 2214, 250000);
        Empleado e3 = new Empleado("Lucia", 0012, 450000);

        System.out.println("Datos de los empleados");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Comparacion de sueldos (e1 vs e2)");
        if(e1.ganaMasQue(e2)){
            System.out.println(e1.getNombre() + "gana mas que " + e2.getNombre());
        }else if(e2.ganaMasQue(e1)){
            System.out.println(e2.getNombre() + "gana mas que " + e1.getNombre());
        }else System.out.println("Tienen el mismo sueldo");

        //quien gana mas de los tres
        System.out.println("---Sueldo mayor---");
        Empleado mayor = e1;
        if(e2.ganaMasQue(mayor)) mayor=e2;
        if(e3.ganaMasQue(mayor)) mayor=e3;
        System.out.println("El sueldo mayor es: "+mayor.getNombre() + "$" + mayor.getSueldo());
    }
}