public class Vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private double precio;

    public Vehiculo(String tipo, int velocidadMaxima, double precio){
        this.tipo=tipo;
        this.velocidadMaxima=velocidadMaxima;
        this.precio=precio;
    }
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo=tipo;}

    public int getVelocidadMaxima() {return velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima=velocidadMaxima;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio=precio;}

    public void aplicarDescuento(double porcentaje){
        if(porcentaje<0) porcentaje = 0;
        else if (porcentaje>100) porcentaje=100;
        this.precio=this.precio*(1-porcentaje/100.00);
    }
    public void aumentarVelocidadMaxima(int incremento){
        if(incremento>0) this.velocidadMaxima += incremento;
    }
    public boolean mayorVelocidad(Vehiculo v){
        return this.velocidadMaxima>v.velocidadMaxima;
    }
    @Override
    public String toString(){
        return "Vehiculo: tipo: " + tipo + "| Velocidad maxima: " + velocidadMaxima + "Km/h" + "| Precio: $" + precio;
    }
}