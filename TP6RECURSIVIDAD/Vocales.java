//Cuenta cantidad de vocales en la cadena cd.
int vocales(String cd){
    if(cd.length()==0){ //cadena vacia.
        return 0;
    }else{
        Char c = Character.toLowerCase(cd.charAt(0)); //toma el primer caracter.
        int esVocal;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            esVolca = 1;
        }else esVocal = 0;
        return esVocal + vocales(cd.substring(1));
    }
}