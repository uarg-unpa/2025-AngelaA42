import java.util.Scanner;
public class TestValidarSeparadores{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una expresion: ");
        String linea = sc.nextLine();

        boolean ok = ValidarSeparadores.esCorrecta(linea);
        System.out.println(ok ? "Correcto" : "Incorrecto");

        sc.close();
    }
}