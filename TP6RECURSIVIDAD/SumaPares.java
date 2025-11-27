//Calcula la suma de los enteros pares.
int sumaPares(int n){
    if(n==2)
      return 2;
    else 
      return n+sumaPares(n-2);
}