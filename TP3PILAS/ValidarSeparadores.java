public class ValidarSeparadores{
    public static boolean esCorrecta(String exp){
        PilaChar pila = new PilaChar(exp.length());

        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);
             
             if(c == '(' || c == '{' || c == '['){
                pila.meter(c);
             }
             else if(c == ')' || c == '}' || c == ']'){
                if(pila.estaVacia()) return false;
                char a = pila.sacar();
                if(!sonPareja(a,c)) return false;
             }
        }
        return pila.estaVacia();
    }
    private static boolean sonPareja(char a, char c){
        if(a == '(' && c == ')') return true;
        if(a == '{' && c == '}') return true;
        if(a == '[' && c == ']') return true;
        return false;
    }
}