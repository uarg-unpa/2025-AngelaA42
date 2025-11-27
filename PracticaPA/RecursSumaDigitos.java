//Suma de los digitos de un numero entero.
public static int sumaDigitos(int n){
    if(n==0){
        return 0;
    }else{
        int digito = n%10;
        return digito + sumaDigitos(n/10);
    }
}