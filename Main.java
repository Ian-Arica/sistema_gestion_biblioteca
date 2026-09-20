import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

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
        libros[1].cantidad_disponible = 7;
        libros[1].estado_libro = "ACTIVO";

        libros[2] = new Libro();
        libros[2].codigo_libro = "0002";
        libros[2].titulo = "La vuelta al mundo en 80 días";
        libros[2].autor = "CCC";
        libros[2].genero = "Narrativo";
        libros[2].cantidad_disponible = 6;
        libros[2].estado_libro = "ACTIVO";

        libros[3] = new Libro();
        libros[3].codigo_libro = "0003";
        libros[3].titulo = "La Biblia";
        libros[3].autor = "DDD";
        libros[3].genero = "Narrativo";
        libros[3].cantidad_disponible = 10;
        libros[3].estado_libro = "ACTIVO";

        libros[4] = new Libro();
        libros[4].codigo_libro = "0004";
        libros[4].titulo = "Boulevard";
        libros[4].autor = "EEE";
        libros[4].genero = "Novela";
        libros[4].cantidad_disponible = 5;
        libros[4].estado_libro = "ACTIVO";

        libros[5] = new Libro();
        libros[5].codigo_libro = "0005";
        libros[5].titulo = "La canción de Aquiles";
        libros[5].autor = "FFF";
        libros[5].genero = "Novela";
        libros[5].cantidad_disponible = 3;
        libros[5].estado_libro = "ACTIVO";

        libros[6] = new Libro();
        libros[6].codigo_libro = "0006";
        libros[6].titulo = "Etéreo";
        libros[6].autor = "GGG";
        libros[6].genero = "Novela";
        libros[6].cantidad_disponible = 2;
        libros[6].estado_libro = "ACTIVO";

        libros[7] = new Libro();
        libros[7].codigo_libro = "0007";
        libros[7].titulo = "La primera Cruzada";
        libros[7].autor = "HHH";
        libros[7].genero = "Narrativo";
        libros[7].cantidad_disponible = 3;
        libros[7].estado_libro = "ACTIVO";

        libros[8] = new Libro();
        libros[8].codigo_libro = "0008";
        libros[8].titulo = "La independencia";
        libros[8].autor = "III";
        libros[8].genero = "Narrativo";
        libros[8].cantidad_disponible = 5;
        libros[8].estado_libro = "ACTIVO";

        libros[9] = new Libro();
        libros[9].codigo_libro = "0009";
        libros[9].titulo = "Curso Java";
        libros[9].autor = "JJJ";
        libros[9].genero = "Curso";
        libros[9].cantidad_disponible = 1;
        libros[9].estado_libro = "ACTIVO";


        usuarios[0] = new Usuario();
        usuarios[0].codigo_usuario = "0001";
        usuarios[0].nombre = "Juan";
        usuarios[0].edad = 70;
        usuarios[0].tipo_usuario = "GENERAL";
        usuarios[0].prestamos_activos = 0;

        usuarios[1] = new Usuario();
        usuarios[1].codigo_usuario = "0002";
        usuarios[1].nombre = "Liam";
        usuarios[1].edad = 11;
        usuarios[1].tipo_usuario = "ESTUDIANTE";
        usuarios[1].prestamos_activos = 0;
        
        usuarios[2] = new Usuario();
        usuarios[2].codigo_usuario = "0003";
        usuarios[2].nombre = "Ian";
        usuarios[2].edad = 19;
        usuarios[2].tipo_usuario = "GENERAL";
        usuarios[2].prestamos_activos = 2;

        usuarios[3] = new Usuario();
        usuarios[3].codigo_usuario = "0004";
        usuarios[3].nombre = "Loshua";
        usuarios[3].edad = 25;
        usuarios[3].tipo_usuario = "ESTUDIANTE";
        usuarios[3].prestamos_activos = 2;

        usuarios[4] = new Usuario();
        usuarios[4].codigo_usuario = "0005";
        usuarios[4].nombre = "Maria";
        usuarios[4].edad = 45;
        usuarios[4].tipo_usuario = "ESTUDIANTE";
        usuarios[4].prestamos_activos = 0;

        
        prestamos[0] = new Prestamo();
        prestamos[0].usuario_prestamo = "0004";
        prestamos[0].libro_prestado = "0006";
        prestamos[0].dias_prestado = 3;
        prestamos[0].estado = "ACTIVO";

        prestamos[1] = new Prestamo();
        prestamos[1].usuario_prestamo = "0004";
        prestamos[1].libro_prestado = "0006";
        prestamos[1].dias_prestado = 3;
        prestamos[1].estado = "DEVUELTO";

        prestamos[2] = new Prestamo();
        prestamos[2].usuario_prestamo = "0003";
        prestamos[2].libro_prestado = "0007";
        prestamos[2].dias_prestado = 2;
        prestamos[2].estado = "DEVUELTO";

        prestamos[3] = new Prestamo();
        prestamos[3].usuario_prestamo = "0003";
        prestamos[3].libro_prestado = "0009";
        prestamos[3].dias_prestado = 6;
        prestamos[3].estado = "ACTIVO";
        

        // Sistema de Menú
        System.out.println("Ingrese la opción que desee:\n1.Mostrar libros.\n2.Mostrar usuarios.\n3.Realizar préstamo.\n.4.Registrar devolución.\n5.Mostrar préstamos activos.\n6.Buscar un libro.\n7.Mostrar estadísticas.\n");

        int decision = s.nextInt();


        switch (decision) {
            case 1:
                System.out.println(" ------------------ Libros ------------------");
                for (int x = 0; x < libros.length; x++){
                    libros[x].consultarInfo();
                    System.out.println("------------------------\n\n");
                }
                
                break;

            case 2:
                System.out.println(" ------------------ Usuarios ------------------");
                for (int x = 0; x < usuarios.length; x ++){
                    usuarios[x].consultarInfo();
                    System.out.println("------------------------\n\n");
                }
                break;

            case 3:
                System.out.println(" ------------------ Realizar prestamo ------------------");

                System.out.print("Ingrese su código de usuario: ");
                String usuario = s.next();
                boolean usuarioExiste = false;
                System.out.print("Ingrese el nombre del libro: ");
                String libro = s.next();
                System.out.print("Ingrese los días a prestar: ");
                int dias = s.nextInt();
                boolean libroExiste = false;
                boolean ejemplarDisponible = false;
                boolean dentroLimite = false;
                boolean cantidadDiasValida = false;

                // Validación de Usuario
                for (int x = 0; x < usuarios.length; x++){

                    if (usuarios[x].codigo_usuario.equals(usuario)){
                        usuarioExiste = true;

                        if (usuarioExiste && usuarios[x].tipo_usuario.equals("ESTUDIANTE") && dias <= 15){
                            dentroLimite = usuarios[x].prestamos_activos <= 3;
                            cantidadDiasValida = true;

                        }
                        else if (usuarioExiste && usuarios[x].tipo_usuario.equals("GENERAL") && dias <= 7)
                            dentroLimite = usuarios[x].prestamos_activos <= 2;
                            cantidadDiasValida = true;
                        }
                        else{
                            dentroLimite = false;
                        }
                }

                // Validación de Libro
                for (int x = 0; x < libros.length; x++){
                    if (libros[x].titulo.equals(libro)){
                        libroExiste = true;

                        if (libroExiste){
                            ejemplarDisponible = libros[x].cantidad_disponible > 0;
                        }
                    }
                }

                // Validación de Ejemplares Disponibles

                if (usuarioExiste && libroExiste && cantidadDiasValida && dentroLimite){
                    
                    System.out.println(usuarioExiste);
                    System.out.println(libroExiste);
                    System.out.println(ejemplarDisponible);
                    System.out.println(dentroLimite);
                    System.out.println(cantidadDiasValida);

                }

                else{
                    System.out.println("No puede acceder al préstamo.");
                }
                  
            
            case 4:
                System.out.println(" ------------------ Realizar devolución ------------------");
            default:
                break;
        }
        System.out.println("-- Menú Principal --");


        s.close();
    }
    
}