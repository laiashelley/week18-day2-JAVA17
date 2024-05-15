public class Usuario {
    
    private double superficieUser;
    private double precioUser;
    private String ubicacionUser;
    private String imuebleUser;

    public Usuario() {
    }

    public Usuario(double superficieUser, double precioUser, String ubicacionUser, String imuebleUser) {
        this.superficieUser = superficieUser;
        this.precioUser = precioUser;
        this.ubicacionUser = ubicacionUser;
        this.imuebleUser = imuebleUser;
    }

    public double getSuperficieUser() {
        return this.superficieUser;
    }

    public void setSuperficieUser(double superficieUser) {
        this.superficieUser = superficieUser;
    }

    public double getPrecioUser() {
        return this.precioUser;
    }

    public void setPrecioUser(double precioUser) {
        this.precioUser = precioUser;
    }

    public String getUbicacionUser() {
        return this.ubicacionUser;
    }

    public void setUbicacionUser(String ubicacionUser) {
        this.ubicacionUser = ubicacionUser;
    }

    public String getImuebleUser() {
        return this.imuebleUser;
    }

    public void setImuebleUser(String imuebleUser) {
        this.imuebleUser = imuebleUser;
    }


    @Override
    public String toString() {
        return "Superficie del usuario: " + getSuperficieUser() + "; " +
            "Precio del usuario: " + getPrecioUser() + "; " +
            "Ubicació del usuario: " + getUbicacionUser() + "; " +
            "Imueble del usuario: " + getImuebleUser();
    }

}
