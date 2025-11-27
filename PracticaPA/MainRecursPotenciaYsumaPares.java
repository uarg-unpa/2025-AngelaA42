public class MainRecursPotenciaYsumaPares{
    public static void main(String[]args){
        int a = 2;
        int b = 3;
        int n = 8;

        int resultadoPotencia;
        int resultadoSumaPares;

        resultadoPotencia = RecursPotenciaYsumaPares.potencia(a,b);
        System.out.println("Potencia: " + a + "^" + b + " = " + resultadoPotencia);

        resultadoSumaPares = RecursPotenciaYsumaPares.sumaPares(n);
        System.out.println("Suma de pares hasta" + n + "=" + resultadoSumaPares);
    }
}