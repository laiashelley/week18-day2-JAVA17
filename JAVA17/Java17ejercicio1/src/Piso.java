public class Piso extends Inmueble {

    // propiedades especificas de piso

    private boolean ascensor;

    // atributos de Inmueble comunes aplicados a Piso sin tener que hacer todo el rollo + propiedad especifica de Piso

    public Piso(double superficie, double precio, String ubicacion, String tipo, boolean ascensor) {
        super(superficie, precio, ubicacion, tipo);
        this.ascensor = ascensor;
    }

    // getters y setters de la propiedad especifica

    public boolean isAscensor() {
        return this.ascensor;
    }

    public boolean getAscensor() {
        return this.ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    // con el toString controlo que no se muestre un "true" o un "false":

    @Override
    public String toString() {
        String ascensorString = "";
        if (ascensor){
            ascensorString = "Tiene ascensor.";
        } else {
            ascensorString = "No tiene ascensor.";
        }

        return "¿Tiene ascensor? " + ascensorString;
    }

}
