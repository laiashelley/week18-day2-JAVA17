public abstract class Inmueble {
    
    // propiedades comunes de los tipos de inmueble

    private double superficie;
    private double precio;
    private String ubicacion;
    private String tipo;

    // constructor vacio para el inmueble

    public Inmueble() {
    }

    // constructor con todos los valores

    public Inmueble(double superficie, double precio, String ubicacion, String tipo) {
        this.superficie = superficie;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    // getters y setters para el inmueble y sus propiedades

    public double getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // toString para mostrar los datos

    @Override
    public String toString() {
        return "{" +
            " superficie='" + getSuperficie() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", ubicacion='" + getUbicacion() + ", tipo='" + getTipo();
    }

}
