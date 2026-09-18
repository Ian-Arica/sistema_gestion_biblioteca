public class Main {
    public static void main(String[] args) {

        // Creación de los Arrays para cada elemento.
        Libro libros[] = new Libro[10];
        Usuario usuarios[] = new Usuario[5];
        Prestamo prestamos[] = new Prestamo[15];

        libros[0] = new Libro();
        libros[0].codigo_libro = "0001";
        libros[0].titulo = "El principito";
        libros[0].autor = "AAA";
        libros[0].genero = "Literario";
        libros[0].cantidad_disponible = 5;
        libros[0].estado_libro = "ACTIVO";

        libros[1] = new Libro();
        libros[1].codigo_libro = "0002";
        libros[1].titulo = "Diccionario";
        libros[1].autor = "BBB";
        libros[1].genero = "Informativo";
        libros[1].cantidad_disponible = 2;
        libros[1].estado_libro = "ACTIVO";

        libros[2] = new Libro();
        libros[2].codigo_libro = "0002";
        libros[2].titulo = "Diccionario";
        libros[2].autor = "BBB";
        libros[2].genero = "Informativo";
        libros[2].cantidad_disponible = 2;
        libros[2].estado_libro = "ACTIVO";

        libros[3] = new Libro();
        libros[3].codigo_libro = "0002";
        libros[3].titulo = "Diccionario";
        libros[3].autor = "BBB";
        libros[3].genero = "Informativo";
        libros[3].cantidad_disponible = 2;
        libros[3].estado_libro = "ACTIVO";

        libros[4] = new Libro();
        libros[4].codigo_libro = "0002";
        libros[4].titulo = "Diccionario";
        libros[4].autor = "BBB";
        libros[4].genero = "Informativo";
        libros[4].cantidad_disponible = 2;
        libros[4].estado_libro = "ACTIVO";

        libros[5] = new Libro();
        libros[5].codigo_libro = "0002";
        libros[5].titulo = "Diccionario";
        libros[5].autor = "BBB";
        libros[5].genero = "Informativo";
        libros[5].cantidad_disponible = 2;
        libros[5].estado_libro = "ACTIVO";

        libros[6] = new Libro();
        libros[6].codigo_libro = "0002";
        libros[6].titulo = "Diccionario";
        libros[6].autor = "BBB";
        libros[6].genero = "Informativo";
        libros[6].cantidad_disponible = 2;
        libros[6].estado_libro = "ACTIVO";

        libros[7] = new Libro();
        libros[7].codigo_libro = "0002";
        libros[7].titulo = "Diccionario";
        libros[7].autor = "BBB";
        libros[7].genero = "Informativo";
        libros[7].cantidad_disponible = 2;
        libros[7].estado_libro = "ACTIVO";

        libros[8] = new Libro();
        libros[8].codigo_libro = "0002";
        libros[8].titulo = "Diccionario";
        libros[8].autor = "BBB";
        libros[8].genero = "Informativo";
        libros[8].cantidad_disponible = 2;
        libros[8].estado_libro = "ACTIVO";

        libros[9] = new Libro();
        libros[9].codigo_libro = "0002";
        libros[9].titulo = "Diccionario";
        libros[9].autor = "BBB";
        libros[9].genero = "Informativo";
        libros[9].cantidad_disponible = 2;
        libros[9].estado_libro = "ACTIVO";

        System.out.println(libros.length);
        // Sistema de Menú
        System.out.println("-- Menú Principal --");
        System.out.println(" - Libros -");
        for (int x = 0; x < libros.length; x++){
            libros[x].consultarInfo();
            System.out.println("------------------------\n\n");
        }
    }
    
}