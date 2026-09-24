# Sistema de gestión de biblioteca

Aplicación de consola desarrollada en Java para gestionar libros, usuarios y préstamos usando arrays de objetos. El proyecto permite llevar el control del catálogo, el registro de usuarios, las operaciones de préstamo y devolución, y las estadísticas básicas del sistema.

## Descripción general

La biblioteca funciona como una pequeña gestión en memoria, orientada a consola. Toda la lógica principal se concentra en `Main.java`, mientras que los modelos de dominio viven en clases separadas para mantener una estructura más clara y mantenible.

## Requisitos

- Java JDK 8 o superior
- Maven 3.6 o superior
- Git, si se desea clonar o publicar el proyecto

## Ejecución

Desde la carpeta raíz del proyecto:

```bash
mkdir -p out
javac -d out src/main/java/biblioteca/*.java
java -cp out biblioteca.Main
```

La carpeta `out/` contiene únicamente los archivos compilados y queda excluida de Git.

También se puede compilar con Maven:

```bash
mvn clean package
java -cp target/classes biblioteca.Main
```

## Funcionalidades

El menú ofrece las siguientes operaciones:

1. Mostrar libros.
2. Mostrar usuarios.
3. Registrar préstamos.
4. Registrar devoluciones.
5. Mostrar préstamos activos.
6. Buscar libros por código.
7. Consultar estadísticas.
8. Salir.

## Diagrama de flujo del sistema

```mermaid
flowchart TD

subgraph group_console["Consola"]
  node_main["Menú y operaciones<br/>[Main.java]"]
  node_arrays["Arrays en memoria<br/>[Main.java]"]
  node_stats["Estadísticas<br/>[Main.java]"]
end

subgraph group_catalog["Catálogo y usuarios"]
  node_book["Libro<br/>[Libro.java]"]
  node_member["Usuario<br/>[Usuario.java]"]
  node_catalog_ops["Listado y búsqueda<br/>[Main.java]"]
  node_member_ops["Listado de usuarios<br/>[Main.java]"]
end

subgraph group_circulation["Préstamos"]
  node_loan["Préstamo<br/>[Prestamo.java]"]
  node_loan_ops["Altas y devoluciones<br/>[Main.java]"]
  node_active_ops["Préstamos activos<br/>[Main.java]"]
end

node_user(("Usuario de biblioteca"))

node_user -->|"elige opciones"| node_main
node_main -->|"muestra resultados"| node_user
node_main -->|"consulta y actualiza"| node_arrays
node_main -->|"despacha"| node_catalog_ops
node_main -->|"despacha"| node_member_ops
node_main -->|"despacha"| node_loan_ops
node_main -->|"despacha"| node_active_ops
node_main -->|"despacha"| node_stats
node_catalog_ops -->|"consulta información"| node_book
node_loan_ops -->|"crea y devuelve"| node_loan
node_loan_ops -->|"ajusta disponibilidad"| node_book
node_loan_ops -->|"ajusta préstamos"| node_member
node_active_ops -->|"consulta activos"| node_loan
node_loan -->|"devuelve ejemplar"| node_book
node_loan -->|"actualiza préstamos"| node_member

click node_main "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"
click node_arrays "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"
click node_book "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Libro.java"
click node_member "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Usuario.java"
click node_loan "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Prestamo.java"
click node_catalog_ops "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"
click node_member_ops "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"
click node_loan_ops "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"
click node_active_ops "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"
click node_stats "https://github.com/ian-arica/sistema_gestion_biblioteca/blob/main/src/main/java/biblioteca/Main.java"

classDef toneNeutral fill:#f8fafc,stroke:#334155,stroke-width:1.5px,color:#0f172a
classDef toneBlue fill:#dbeafe,stroke:#2563eb,stroke-width:1.5px,color:#172554
classDef toneAmber fill:#fef3c7,stroke:#d97706,stroke-width:1.5px,color:#78350f
classDef toneMint fill:#dcfce7,stroke:#16a34a,stroke-width:1.5px,color:#14532d
classDef toneRose fill:#ffe4e6,stroke:#e11d48,stroke-width:1.5px,color:#881337
classDef toneIndigo fill:#e0e7ff,stroke:#4f46e5,stroke-width:1.5px,color:#312e81
classDef toneTeal fill:#ccfbf1,stroke:#0f766e,stroke-width:1.5px,color:#134e4a
class node_main,node_arrays,node_stats toneBlue
class node_book,node_member,node_catalog_ops,node_member_ops toneAmber
class node_loan,node_loan_ops,node_active_ops toneMint
class node_user toneIndigo
```

## Estructura del proyecto

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
├── LICENSE
└── README.md
```

- `src/main/java/biblioteca/Main.java`: inicia la aplicación y contiene el menú principal.
- `src/main/java/biblioteca/Libro.java`: representa los libros y su disponibilidad.
- `src/main/java/biblioteca/Usuario.java`: representa a los usuarios y su historial de préstamos.
- `src/main/java/biblioteca/Prestamo.java`: representa la relación entre un usuario y un libro prestado.

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
