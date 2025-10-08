public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int cantidadPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    public void setCantidadPaginas(int cantidadPaginas){
        this.cantidadPaginas = cantidadPaginas;
    }
    public int getCantidadPaginas(){
        return this.cantidadPaginas;
    }

    public boolean esReciente(){
        boolean resultado;
        if(this.anioPublicacion>2010){
            resultado = true;
        }
        else {
            resultado = false;
        }
        return resultado;
    }
    public boolean masDe300(){
        boolean resultado;
        if(cantidadPaginas>300){
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "| Autor: " + autor + "| Fecha de publicacion: " + anioPublicacion + "| Cantidad de paginas: " + cantidadPaginas + "| El libro es reciente?: " + esReciente() + "| Tiene mas de 300 paginas?: " + masDe300();

    }
}


