//3) a)
int potencia(int m, int n){
    if(n==0)
      return 1;
    else 
      return (m*potencia(m,n-1));
}
//Caso base: if(n==0)
//Llamada recursiva a una version mas pequeña: return(m*potencia(m,n-1));
//¿Que hace el metodo?: para n>=0, el metodo calcula m elevado a n. 
//b)
int factorial(int n){
    if(n>0){
      return (n*factorial(n-1));
    }else{ 
      if(n==0){
        return 1;
      }else{ 
        return -1;}
    }
}
//Caso base: n==0 y n<0
//Llamada recursiva: return (n*factorial(n-1));
//¿Que hace el metodo?: para n>0, calcula el factorial de n.

