import java.util.Scanner;
public class Libro {

    Scanner s = new Scanner(System.in);
    String codigo_libro;
    String titulo;
    String autor;
    String genero;
    int cantidad_disponible;
    String estado_libro;

    // Mostrar la información de un Libro.
    public void consultarInfo(){

        System.out.println("-- Información del Libro --");
        System.out.println("Código: " + codigo_libro);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Cantidad disponibles: " + cantidad_disponible);
        System.out.println("Estado del libro: " + estado_libro);
    };

}