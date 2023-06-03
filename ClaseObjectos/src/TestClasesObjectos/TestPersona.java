package TestClasesObjectos;


import EntradaSalida.Tools;
import TDA.Fecha;
import TDA.Persona;

public class TestPersona {
public static void main(String[]args) 
{
	capturaObjetos();
}
public static void capturaObjetos()
{
	String listado="";
	byte res=0, contHom=0,contMuj=0, mayor=0;
	Persona aux=new Persona();
	do {
	Persona objeto=new Persona();
	objeto.setNomPer(Tools.leerString("Nombre: "));
	objeto.setEdadPers(Tools.leerByte("Edad: "));
	objeto.setNacioPer(Tools.leerString("Nacionalidad: "));
	objeto.setTelPers(Tools.leerEntero("Telefono: "));
	objeto.setGenePer(Tools.leerChar("Genero [M]ujeres [H]ombres: "));
	objeto.setFechPer(new Fecha(Tools.leerByte("Dia:"),Tools.leerByte("Mes:"),Tools.leerShort("Anio:")));
	listado+="Datos capturados:\n"+objeto.toString()+"\n";
	if(objeto.getGenePer()=='M'|| objeto.getGenePer()=='m')
		contMuj++;
	else if(objeto.getGenePer()=='H'|| objeto.getGenePer()=='h')
		contHom++;
	if (objeto.getEdadPers()>mayor) {
		mayor=objeto.getEdadPers();
		aux=objeto;
	}
	res=(byte) Tools.seguirSino();
	}while(res!=1);

	Tools.imprimePantalla("Listado de personas:\n"+listado+"\n Frecuencias\n Mujeres"+imprimeFrecuencia(contMuj)+ (contMuj*100)/(contHom+contMuj)+
			"%\n Hombres"+imprimeFrecuencia(contHom)+(contHom*100)/(contHom+contMuj)+"%\n \n El mayor es: \n"+aux.toString());
}
	public static String imprimeFrecuencia(byte n) {
		String cad=" ";
		for(int i=1;i<=n;i++) {
			cad+="*";
		}
		return cad;
}
}

