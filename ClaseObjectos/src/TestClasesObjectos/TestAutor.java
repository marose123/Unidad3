package TestClasesObjectos;

import EntradaSalida.Tools;
import TDA.Autor;
import TDA.Libro;

public class TestAutor {
	public static void main(String[]args) {
		capturaLibros();
	}
	public static void capturaLibros() {
		String listado="";
		byte res=0;
		short menor=32767;
		Libro libMayor=new Libro();
		do {
			Libro libros=new Libro();
			libros.setTitulo(Tools.leerString("Titulo: "));
			libros.setAutor(new Autor(Tools.leerString("Nombre: "),Tools.leerString("Apellido: ")));
			libros.setIsbn(Tools.leerEntero("ISBN: "));
			libros.setPaginas(Tools.leerShort("Paginas: "));
			listado+="Libros capturados:\n"+libros.toString()+"\n";
			res=(byte) Tools.seguirSino();
			if (libros.getPaginas()<menor) {
				menor=libros.getPaginas();
				libMayor=libros;
			}
		}while (res!=1);
		Tools.imprimePantalla("Listado de libros"+listado+"\n \n El Libro con el mayor numero de paginas es:\n"+libMayor.toString());
	}
}

