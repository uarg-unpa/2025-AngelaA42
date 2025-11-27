public class Persona{
    private String apellido;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String apellido, int edad, String dni, char sexo, double peso, double altura){
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido=apellido;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad=edad;}

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni=dni;}

    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo=sexo;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso=peso;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura=altura;}

    public int calcularIMC(){
        return peso/(altura*2);

        int IMC;
        if(IMC<18){
           return -1;
        }else if(IMC>=18 && IMC<=25){
            return 0;
        }else if(IMC>25){ 
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
         return this.edad>=18;
    }

    public boolean esMayorQue(Persona p){
         return this.edad>p.edad;
    }
}
    
