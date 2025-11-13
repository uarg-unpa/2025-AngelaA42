public class Articulo{
    private String descripcion;
    private double precio;
    private String codigo;
    private int stock;

    public Articulo(String descripcion, double precio, String codigo, int stock){
        this.descripcion=descripcion;
        this.precio=precio;
        this.codigo=codigo;
        this.stock=stock;
        if(this.stock<0)this.stock = 0;
    }
    public String getDescripcion(){return descripcion;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}

    public double getPrecio(){return precio;}
    public void setPrecio(double precio){this.precio=precio;}

    public String getCodigo(){return codigo;}
    public void setCodico(String codigo){this.codigo=codigo;}

    public int getStock(){return stock;}
    public void setStock(int stock){this.stock=stock<0 ? 0 : stock;}

    public void incrementarStock(int cantidad){
        if(cantidad>0){
            this.stock=this.stock+cantidad;
        }
    }
    public void decrementarStock(int cantidad){
        if(cantidad>0){
            this.stock=this.stock-cantidad;
            if(this.stock<0)this.stock=0;
        }
    }
    @Override
    public String toString(){
        return "Articulo "+descripcion+ "| Precio: "+precio+ "| Codigo: "+codigo+ "| Stock: "+stock;
    }
}