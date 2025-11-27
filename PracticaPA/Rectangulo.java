public class Rectangulo{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public double getBase() {return base;}
    public void setBase(double base) {this.base=base;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura=altura;}

    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }
    public boolean esMayorElArea(Rectangulo r){
        return this.calcularArea()>r.calcularArea();
    }
    @Override
    public String toString(){
        return "Base: " + base + "| Altura: " + altura;
    }
}