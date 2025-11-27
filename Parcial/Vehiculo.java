public class Vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private double precio;

    public Vehiculo(String tipo, int velocidadMaxima, double precio){
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }
    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo = tipo;}

    public int getVelocidadMaxima() {return velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima){this.velocidadMaxima = velocidadMaxima;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio){this.precio = precio;}

    public aplicarDescuento(double porcentaje){
        this.precio = precio*porcentaje;
        return aplicarDescuento();
    }
    public aumentarVelocidadMaxima(int incremento){
        this.velocidadMaxima = velocidadMaxima + incremento;
        return aumentarVelocidadMaxima();
    }
    public mayorVelocidad(Vehiculo V){
        if(velocidadMaxima>mayorVelocidad){
            return true;}
    }
    @Override
    public String toString(){
        return "Tipo de vehiculo: " + tipo + " | Velocidad maxima: " + velocidadMaxima + " | Precio: " + precio;
    }
}
