public class Metodos {
    
    // metodo para conseguir mostrar el tipo y la ubicacion de cada uno de los imuebles:

    public static void mostrarTipoUbicacion(Inmueble inmueble){

        System.out.println(inmueble.getTipo() + " " + "en " + inmueble.getUbicacion());

    }

    // metodos para conseguir mostrar todas las caracteristicas de los inmuebles:

    public static void mostrarCaracteristicasCasa(Casa casa){

        System.out.println("Las características de las casas que tenemos disponibles:");
        System.out.println();
        System.out.println("Superficie: " + casa.getSuperficie());
        System.out.println("Precio: " + casa.getPrecio());
        System.out.println("Ubicación: " + casa.getUbicacion());
        System.out.println(casa.toString());

    }

    public static void mostrarCaracteristicasPiso(Piso piso){

        System.out.println("Las características de los pisos que tenemos disponibles:");
        System.out.println();
        System.out.println("Superficie: " + piso.getSuperficie());
        System.out.println("Precio: " + piso.getPrecio());
        System.out.println("Ubicación: " + piso.getUbicacion());
        System.out.println(piso.toString());

    }

    public static void mostrarCaracteristicasTrastero(Trastero trastero){

        System.out.println("Las características de los trasteros que tenemos disponibles:");
        System.out.println();
        System.out.println("Superficie: " + trastero.getSuperficie());
        System.out.println("Precio: " + trastero.getPrecio());
        System.out.println("Ubicación: " + trastero.getUbicacion());
        System.out.println(trastero.toString());

    }

    // esto para probar la sobrecarga de metodos con solo tipo y ubicación:

    public static void mostrarTipoUbicacion(String tipo, String ubicacion) {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + ubicacion);
    }

    // mostrar frase completa con todas las caracteristicas:

    public static void fraseCaracteristicas(Inmueble inmueble){

        System.out.println("El inmueble tiene " + inmueble.getSuperficie() + ", ubicado en la gran ciudad de " + inmueble.getUbicacion() + ". Su precio es " + inmueble.getPrecio() + " euros.");

    }

}
