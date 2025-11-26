//G(x,y) = 1, si x<=y. G(x,y+1)+1, si y<x.
//a) Metodo recurivo.
int G(int x, int y){
    if(x<=y)
      return 1;
    else
      return G(x, y+1) +1;
}
//b) G(8,6)
//         G(8,6) = 6(8,7)+1  (6<8)
//         G(8,7) = G(8,8)+1  (7<8)
//         G(8,8) = 1         (8<=8)
//         G(8,7) = 1+1 = 2
//         G(8,6) = 2+1 = 3
//         Resultado de G(8,6) = 3.
//c) G(100,10) -> se va sumando 1 mientras "y" crece hasta llegar a "x". (desde 10 hasta 100 hay 100-10 = 90 pasos, y al final se suma el 1 del caso base)
//   G(100,10) = (100-10)+1 = 90 + 1 = 91
//   Resultado de G(100,10) = 91.