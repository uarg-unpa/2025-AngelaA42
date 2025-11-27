public static funcionG(int x, int y){
    if(x < y){
        return 1;
    }else{
        return 1 + funcionG(x, y+1);
    }
}