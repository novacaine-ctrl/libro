public class App {

    public static void main(String[] args) {

        Libro libro1 = new Libro();

        libro1.setTitulo("El Principito");
        libro1.setAutor("Antoine de Saint-Exupéry");


        Libro libro2 = new Libro(
            "Cien años de soledad",
            "Gabriel García Márquez"
        );

        //  el objeto usa el constructors completo
        Libro libro3 = new Libro(
            "1984",
            "George Orwell",
            false
        );

        // Muestra la info de los tres libros
        System.out.println("LIBRO 1");
        libro1.mostrarinfo();

        System.out.println("LIBRO 2");
        libro2.mostrarinfo();

        System.out.println("LIBRO 3");
        libro3.mostrarinfo();
    }
}