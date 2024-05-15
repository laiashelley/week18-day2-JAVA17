// Tienes un programa principal de gestión inmobiliaria, que gestiona tres tipos de inmuebles: OK

// Características en común: superficie, precio, ubicación. Opcional: se puede añadir tipo: casa, piso, trastero
// como un campo más en vez de buscar la clase. OK.

// Características personalizadas: OK

// - Casa => es adosada?
// - Piso => en que planta está? Tiene ascensor?
// - Trastero => tiene seguridad?

// Crear una clase abstracta Edificio, o Inmueble, u otro nombre, de la cual hereden el resto. OK

// - Instanciar al menos dos de cada tipo (casa, piso , trastero). OK

// - Dos tipos de consulta: una que muestre solo tipo y ubicación: ‘casa en Santa Coloma’ OK

// - Y otra que muestre todas las características. Mostrar casas OK

// • Probar constructor vacío y luego llenarlo en el main OK

// • Probar sobrecarga de métodos (método solo con tipo y ubicación) OK

// • Verificar qué ocurre con los toString() en cada caso. No vale decir: ascensor=true. Tiene que ser
// frase completa: ‘Es una casa de 100m2 en Sta. Coloma que vale 400.000E y está adosada’ OK

// • Probar a crear un atributo final en una de las clases hijas.  NOSE

// +extra: añadir datos por entrada de teclado OK

import java.util.ArrayList;
import java.util.Scanner;

public class Java17ejercicio1{
    public static void main(String[] args) throws Exception {

        // instanciamos dos de cada tipo: casa, piso, trastero
        
        Casa casa1 = new Casa(180, 350.000, "Atlanta", true, "casa");
        Casa casa2 = new Casa(120, 180.000, "Madrid", true, "casa");

        Piso piso1 = new Piso(80, 200.000, "París", "piso", true);
        Piso piso2 = new Piso(100, 300.000, "New York", "piso",false);

        Trastero trastero1 = new Trastero(10, 10.000, "Londres", "trastero", true);
        Trastero trastero2 = new Trastero(15, 8.000, "Berlín", "trastero", false);

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        // mostramos tipo y ubicación, creo Array para simplificar codigo:

        Inmueble[] inmuebles = new Inmueble[]{casa1, casa2, piso1, piso2, trastero1, trastero2};

        for (Inmueble inmueble : inmuebles) {
            Metodos.mostrarTipoUbicacion(inmueble);
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println();
        }

        // mostramos todas caracteristicas de todos los tipos

        Metodos.mostrarCaracteristicasCasa(casa1);

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        Metodos.mostrarCaracteristicasCasa(casa2);

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        Metodos.mostrarCaracteristicasPiso(piso1);

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        Metodos.mostrarCaracteristicasPiso(piso2);

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        Metodos.mostrarCaracteristicasTrastero(trastero1);

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        Metodos.mostrarCaracteristicasTrastero(trastero2);

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
        
        // creo new Casa con el constructor vacío:

        Casa casa = new Casa(150, 250.000, "Barcelona", true, "casa");

        Metodos.mostrarCaracteristicasCasa(casa);

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        // mostrar valores usando metodo en clase Metodos:

        Metodos.mostrarTipoUbicacion("casa", "Manresa");
        System.out.println();
        Metodos.mostrarTipoUbicacion("piso", "Girona");
        System.out.println();
        Metodos.mostrarTipoUbicacion("trastero", "Lleida");

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        // mostrar frases con caracteristicas comunes:

        for (Inmueble inmueble : inmuebles) {
            Metodos.fraseCaracteristicas(inmueble);
            System.out.println();
        }
        
        // introducción usuario con Scanner

        entradaUsuarioDatos(new Scanner(System.in));

    }

    public static void menu(){
        System.out.println("Este es un programa de introducción de datos. Aprienta 'ENTER' si quieres continuar, introduce 'salir' si quieres salir.");
    }

    public static void entradaUsuarioDatos(Scanner sc){

        // creo array para acumular los datos

        ArrayList <Usuario> listaDatosUsuario = new ArrayList<>();

        boolean continuar = true;

        do {

            menu();
            double superficieUser = 0;
            double precioUser = 0;
            String ubicacionUser = "";
            String imuebleUser = "";

            System.out.println("Introduce un tipo de superficie:");
            superficieUser = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("Introduce un precio:");
            precioUser = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("Introduce una ubicacion:");
            ubicacionUser = sc.nextLine();

            System.out.println("Introduce un tipo de inmueble (casa, piso o trastero)");
            imuebleUser = sc.nextLine();

            // creo instancia de que se cree nuevos valores

            Usuario usuario = new Usuario(superficieUser, precioUser, ubicacionUser, imuebleUser);
            listaDatosUsuario.add(usuario);

            System.out.println();
            System.out.println("___________________________________________________");
            System.out.println();

            System.out.println("¿Quieres continuar? (sino, pon salir)");
            String respuestaUsuario = sc.nextLine();
            if (respuestaUsuario.equalsIgnoreCase("salir")){
                continuar = false;
            }

            System.out.println();
            System.out.println("___________________________________________________");
            System.out.println();

            System.out.println("Los datos introducidos son: ");
            for (Usuario datos : listaDatosUsuario){
                System.out.println(datos);
            }

        } while (continuar);


    }

}
