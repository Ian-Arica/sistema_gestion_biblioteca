public class Prestamo {
    
    int id;
    Usuario usuario_prestamo;
    Libro libro_prestado;
    int dias_prestado;
    String estado;

    public void consularPrestamos(){
        System.out.println("-- Información del Prestamo --");
        System.out.println("ID: " + id);
        System.out.println("Usuario del préstamo: " + usuario_prestamo);
        System.out.println("Libro prestado: " + libro_prestado);
        System.out.println("Dias de préstamo: " + dias_prestado);
        System.out.println("Estado del préstamo: " + estado);
    }

    public void devolucion(){
        libro_prestado.cantidad_disponible ++;
        usuario_prestamo.prestamos_activos ++;
        libro_prestado.estado_libro = "DEVUELTO";
    }
}
