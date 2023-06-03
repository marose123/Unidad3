
package TDA;

public class Libro {
	private String titulo;
	private Autor autor;
	private int isbn;
	private short paginas;
	public Libro() {}
	public Libro(String titulo, Autor autor, int isbn, short paginas) {
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
		this.paginas=paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public short getPaginas() {
		return paginas;
	}
	public void setPaginas(short paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Libro [titulo= " + titulo + ", autor= " + autor + ", isbn= " + isbn + ", paginas= " + paginas + "]";
	}
}

