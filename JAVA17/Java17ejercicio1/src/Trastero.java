public class Trastero extends Inmueble {

    // propiedades especificas de Trastero

    private boolean seguridad;

    // atributos de Inmueble comunes aplicados a Trastero sin tener que hacer todo el rollo

    public Trastero(double superficie, double precio, String ubicacion, String tipo, boolean seguridad) {
        super(superficie, precio, ubicacion, tipo);
        this.seguridad = seguridad;
    }

    // getters y setters de la propiedad especifica

    public boolean isSeguridad() {
        return this.seguridad;
    }

    public boolean getSeguridad() {
        return this.seguridad;
    }

    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }

    // con el toString controlo que no se muestre un "true" o un "false":

    @Override
    public String toString() {
        String seguridadString = "";
        if (seguridad){
            seguridadString = "Tiene seguridad.";
        } else {
            seguridadString = "No tiene seguridad.";
        }
        return "¿Tiene seguridad?" + " " + seguridadString;
    }

}

