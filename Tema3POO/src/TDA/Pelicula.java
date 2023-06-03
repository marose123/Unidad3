package TDA;

public class Pelicula {
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int año;
    private double calificacion;

    public Pelicula(String nombre, String director, String genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("G�nero: " + genero);
        System.out.println("Duraci�n: " + duracion + " minutos");
        System.out.println("A�o: " + año);
        System.out.println("Calificaci�n: " + calificacion);
    }

    private boolean esPeliculaEpica() {
        return duracion >= 180;
    }

    private String calcularValoracion() {
        if (calificacion >= 0 && calificacion <= 2) {
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else if (calificacion > 8 && calificacion <= 10) {
            return "Excelente";
        } else {
            return "Valoraci�n inv�lida";
        }
    }

    private boolean esSimilar(Pelicula otraPelicula) {
        return this.genero.equals(otraPelicula.genero) && this.calificacion == otraPelicula.calificacion;
    }

    public static void main(String args[]) {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", "Drama", 191, 1982, 8.3);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", "Acci�n", 115, 2011, 7.0);
        pelicula1.imprimir();
        System.out.println();
        pelicula2.imprimir();
        System.out.println();
        System.out.println("La pel�cula " + pelicula1.getNombre() + " es �pica: " + pelicula1.esPeliculaEpica());
        System.out.println("La pel�cula " + pelicula2.getNombre() + " es �pica: " + pelicula2.esPeliculaEpica());
        System.out.println("La pel�cula " + pelicula1.getNombre() + " y la pel�cula " + pelicula2.getNombre() + " son similares: " + pelicula1.esSimilar(pelicula2));
    }

public String toString() {
    return "Nombre: " + nombre + "\n" +
           "Director: " + director + "\n" +
           "G�nero: " + genero + "\n" +
           "Duraci�n: " + duracion + " minutos\n" +
           "Año: " + año + "\n" +
           "Calificaci�n: " + calificacion;
}
}
    
      
  

