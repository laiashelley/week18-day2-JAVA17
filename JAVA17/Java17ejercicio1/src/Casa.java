public class Casa extends Inmueble {

    // propiedad especifica de casa

    private boolean adosada;

    // atributo "final" tienePatio


    // atributos de Inmueble comunes aplicados a Casa sin tener que hacer todo el rollo + el atributo especifico de Casa

    public Casa(double superficie, double precio, String ubicacion, boolean adosada, String tipo) {
        super(superficie, precio, ubicacion, tipo);
        this.adosada = adosada;
    }

    // constructor vacío casa:
    
    public Casa() {
        super();
    }

    // getters y setters de la propiedad especifica

    public boolean isAdosada() {
        return this.adosada;
    }

    public boolean getAdosada() {
        return this.adosada;
    }

    public void setAdosada(boolean adosada) {
        this.adosada = adosada;
    }

    // con el toString controlo que no se muestre un "true" o un "false":

    @Override
    public String toString() {
        String adosadaString = "";
        if(adosada){
            adosadaString = "Está adosada.";
        } else{
            adosadaString = "No está adosada.";
        }
        return 
           "¿Esta adosada?" + " " + adosadaString;
    }

}
