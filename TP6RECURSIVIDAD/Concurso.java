int concurso(int base, int limite){
    if(base==limite)
        return 1;
    else if{base>limite}{
        return 0;
    }return (base+concurso(base+1, limite));
}
//a) int x = concurso(0,3); concurso(0,3) = 0 + concurso(1,3) -> 0+4=4
//                          concurso(1,3) = 1 + concurso(2,3) -> 1+3=4
//                          concurso(2,3) = 2 + concurso(3,3) -> 2+1=3
//                          concurso(3,3) = 1 (base==limite) 
//                                                                x=4.
//b) int y = concurso(10,7); cumple base>limite -> return 0;      y=0.
//c) int z = concurso(5,50); concurso(base,limite) = base + concurso(base+1,limite) -> termina cuando base==limite retornando 1.
//                           concurso(5,50) = 5+6+7+...+49+1
//                           concurso(5,50) = 1215+1=1216         z=1216.   