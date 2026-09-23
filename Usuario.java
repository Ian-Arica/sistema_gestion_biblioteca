public class Usuario {
    
    String codigo_usuario;
    String nombre;
    int edad;
    String tipo_usuario;
    int prestamos_activos;


    // Mostrar información del Usuario
    public void consultarInfo(){

        System.out.println("-- Información del Usuario --");
        System.out.println("Código: " + codigo_usuario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo: " + tipo_usuario);
        System.out.println("Prestamos activos: " + prestamos_activos);
    }

    public void aumentarPrestamo(){
        prestamos_activos ++;
    }

    public void devolucion(){
        prestamos_activos --;
    }

    @Override
    public String toString(){
        return nombre + " (Código: " + codigo_usuario + ")";
    }
}
