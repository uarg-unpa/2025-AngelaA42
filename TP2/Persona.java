public class Persona{
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.dni=0;
        this.sexo='H';
        this.peso=0.0;
        this.altura=0.0;
    }
    public Persona(String nombre){
        this();
        this.nombre=nombre != null? nombre : "";
    }
    public String getNombre(){return nombre;}
    public void setNombre(String nombre) {this.nombre=(nombre != null? nombre : "");}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad=Math.max(0,edad);}

    public int getDni(){return dni;}
    public void setDni(int dni){this.dni=dni;}

    public char getSexo(){return sexo;}
    public void setSexo(char sexo){if(sexo=='H'|| sexo=='M'){this.sexo=sexo;}else{this.sexo='H';}}

    public double getPeso(){return peso;}
    public void setPeso(double peso){this.peso=Math.max(0.0,peso);}

    public double getAltura(){return altura;}
    public void setAltura(double altura){this.altura=Math.max(0.0,altura);}

    public boolean esMayorDeEdad(){
        return edad>=18;
    }
    private boolean comprobarSexo(char sexo){
        return sexo=='H' || sexo=='M';
    }
    @Override
    public String toString(){
        return "Personal -> Nombre: "+nombre+ ",Edad: "+edad+ ", DNI: "+dni+ ", Sexo: "+sexo+ ", Peso: "+peso+ ", Altura: "+altura+ ", ¿Es mayor de edad?: "+esMayorDeEdad();
    }
}


