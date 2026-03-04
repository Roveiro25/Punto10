public class objProducto{
    private String nombre;
    private double precio;
    private boolean enOferta;

    public objProducto() {}

    public objProducto(String nombre, double precio, boolean enOferta) {
        this.nombre = nombre;
        this.precio = precio;
        this.enOferta = enOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }    

}