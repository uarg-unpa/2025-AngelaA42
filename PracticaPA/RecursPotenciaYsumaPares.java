public class RecursPotenciaYsumaPares{
    
    public static int potencia(int a, int b){
        if(b==a){
            return 1;
        }else{
            return a*potencia(a, b-1);
        }
    }
    public static int sumaPares(int n){
        if(n==2){
            return 2;
        }else{
            return n + sumaPares(n-2);
        }
    }
}