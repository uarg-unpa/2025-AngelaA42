public class Ejercicio2 {
    public static void main (String[]args) {
        int valor1=5, valor2=3, x1, x2;
        double decimal1=7.5, decimal2=2.0, y1, y2, y3, y4, y5, y6;

        x1= valor1/valor2;
        x2= (int)(valor1*decimal2)/(int)(decimal1/valor1);
        y1= valor1/valor2;
        y2= (double)(valor1/valor2);
        y3= (double) valor1*decimal2/(int)decimal1;
        y4= (double) valor1*decimal2;
        y5= valor1*(int)decimal2;
        y6= (int)(valor1*(int)decimal2);

        System.out.println("Resultado (valor1/valor2)= " + x1);
        System.out.println("Resultado ((int)(valor1*decimal2)/(int)(decimal1/valor1)= " + x2);
        System.out.println("Resultado(valor1/valor2) = " + y1);
        System.out.println("Resultado((double)(valor1/valor2)) = " + y2);
        System.out.println("Resultado((double)valor1*decimal2/(int)decimal1)= " + y3);
        System.out.println("Resultado((double)valor1*decimal2)= " + y4);
        System.out.println("Resultado((double)(valor1*decimal2)/(decimal1*(int)decimal2))= " + y5);
        System.out.println("Resultado(valor1*(int)decimal2) = " + y6);
    }
}

