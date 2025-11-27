public static int sumaPares(int n){
    if(n<=0){
        return 0;
    }else if(n%2==0){
        return n + sumaPares(n-1);
    }else{
        return sumaPares(n-1);
    }
}