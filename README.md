# Sistema de gestión de biblioteca

Aplicación de consola desarrollada en Java para gestionar libros, usuarios y préstamos usando arrays de objetos.

## Requisitos

- Java JDK 8 o superior
- Maven 3.6 o superior
- Git, si se desea clonar o publicar el proyecto

## Ejecutar el programa

Desde la carpeta raíz del proyecto:

```bash
mkdir -p out
javac -d out src/main/java/biblioteca/*.java
java -cp out biblioteca.Main
```

La carpeta `out/` contiene únicamente los archivos compilados y está excluida de Git.

También se puede compilar con Maven:

```bash
mvn clean package
java -cp target/classes biblioteca.Main
```

## Funcionalidades

El menú permite:

1. Mostrar libros.
2. Mostrar usuarios.
3. Registrar préstamos.
4. Registrar devoluciones.
5. Mostrar préstamos activos.
6. Buscar libros por código.
7. Consultar estadísticas.
8. Salir.

## Estructura

```text
sistema-gestion-biblioteca/
├── src/main/java/biblioteca/
│   ├── Main.java
│   ├── Libro.java
│   ├── Usuario.java
│   └── Prestamo.java
├── pom.xml
├── .gitattributes
├── .gitignore
└── README.md
```

- `src/main/java/biblioteca/Main.java`: inicia la aplicación y contiene el menú.
- `src/main/java/biblioteca/Libro.java`: representa los libros y sus ejemplares disponibles.
- `src/main/java/biblioteca/Usuario.java`: representa a los usuarios y sus préstamos activos.
- `src/main/java/biblioteca/Prestamo.java`: representa los préstamos y su estado.

## Publicar en GitHub

1. Crea un repositorio vacío en GitHub.
2. Conecta el repositorio remoto:

   ```bash
   git remote add origin https://github.com/USUARIO/NOMBRE-DEL-REPOSITORIO.git
   ```

3. Guarda los cambios y publícalos:

   ```bash
   git add .
   git commit -m "Preparar proyecto para GitHub"
   git push -u origin main
   ```
