public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

   public Libro() {     
    disponible = true;
    }

   public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponible = true;
   }

   public Libro (String titulo, String autor, boolean disponible) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponible = disponible;
   }

   public String getTitulo () {
    return titulo;
   }

   public String getAutor () {
    return autor;
   }

   public boolean isDisponible () {
    return disponible;
   }


   // Setters

   public void setTitulo (String titulo) {
    if (titulo != null && !titulo.isEmpty ()) {
        this.titulo = titulo;
    } else {
        System.out.println ("Error: el titulo no puede estra vacio.");
    }
   }
   public void setAutor (String autor) {
    this.autor = autor;
   }

   public void setDisponible (boolean disponible){
    this.disponible = disponible;
   }

   // Metodos

   public void mostrarinfo(){
    System.out.println ("---- Libro ----");
    System.out.println ("Titulo     : " + titulo);
    System.out.println ("autor      : " + autor);
    System.out.println ("Disponible : " + (disponible ? "si" : "no"));
   }

   public boolean prestar (){
    if (disponible){
        disponible = false;
        System.out.println ("El libro \'" + titulo + "' ha sido prestado.");
        return true;
    } else {
        System.out.println ("El libro \'" + titulo + "' no está disponible.");
        return false;
    }
   }

        public void devolver() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto."   );
    }



    
    }
   
    