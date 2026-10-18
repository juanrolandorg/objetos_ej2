public class Usuario {
    //atributos: nombre, edad y correo
    private String nombre;
    private int edad;
    private String correo;

    //creo el constructor
    public Usuario( String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    //métodos:
    public void mostrarInformacion(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.correo);
        
    }

    public void cambiarNombre(String cambio){
        this.nombre = cambio;
    }

    public void cambiarCorreo(String cambio){
        this.nombre = cambio;
    }
    public void cumpliAnios(int anios){
        edad = edad +anios;
    }
}
