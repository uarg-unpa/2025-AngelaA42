int puzzle(int base,int limite){
    if(base>limite){
        return -1;
    }else if(base==limite){
        return 1;
    }else 
        return(base*Puzzle(base+1, limite));
}
//a) Casos base: 1.if(base>limite). 2.if(base==limite). en ambos no hay llamada recursiva.
//   Caso general: cuando base es menor que limite.
//b) Resultados: 1.cuando Puzzle(14,10); cumple base>limite, entra en el primer if y el resultado es -1.
//               2.cuando Puzzle(4,7); cumple base<limite, puzzle(4,7)=4*puzzle(5,7)
//                                                                    =4*(5*puzzle(6,7))
//                                                                    =4*5*puzzle(6,7)
//                                                         puzzle(6,7)=6*puzzle(7,7)
//                                                         puzzle(7,7)=1 (caso base)
//                                                         puzzle(6,7)=6*1=6
//                                                         puzzle(5,7)=5*6=30
//                                                         puzzle(4,7)=4*30=120
//                                                         resultado: 120.
//c) cuando puzzle(0,0), se cumple base==limite,segundo caso base resultado: 1.