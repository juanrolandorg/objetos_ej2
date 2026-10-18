public class Main {
public static void main(String[] args) {

//creo un usuario de ejemplo
Usuario u1 = new Usuario("Pepe", 12, "ejemplo@ejemplo");
Usuario u2 = new Usuario("Manolín", 12, "ejadadhasisdhasdsbh");


    u1.mostrarInformacion();
    System.out.println();
    u2.mostrarInformacion();
    System.out.println();
    u1.cambiarNombre("Alcachofa");
    u1.cambiarCorreo("ejemplo@222222");
    u2.cumpliAnios(3);
    System.out.println();
    u1.mostrarInformacion();
    System.out.println();
    u2.mostrarInformacion();
}
}