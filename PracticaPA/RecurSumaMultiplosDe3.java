//Calcula la suma de los multiplos de 3 hasta n.
public static int sumaMultiplosDe3(int n){
    if(n==3){
        return 3;
    }else{
        return n + sumaMultiplosDe3(n-3);
    }
}
