package TestClasesObjectos;

import EntradaSalida.Tools;
import TDA.Persona2;

public class TestPersona2 {
	public static void CapturaDatos() {
		byte p,p2;
		String pe, pe2, ed, ed2;
		Persona2 per=new Persona2();
		per.setNom(Tools.leerString("Nombre: "));
		per.setEdad(Tools.leerByte("Edad: "));
		per.setSex(Tools.leerChar("Sexo: [H]ombre [M]ujer"));
		per.setPeso(Tools.leerFloat("Peso en kg: "));
		per.setAltura(Tools.leerFloat("Altura en metros: "));
		Persona2 per2=new Persona2();
		per2.setNom(Tools.leerString("Nombre: "));
		per2.setEdad(Tools.leerByte("Edad: "));
		per2.setSex(Tools.leerChar("Sexo: [H]ombre [M]ujer"));
		p=Persona2.calculaIMC(per.getPeso(), per.getAltura());
		p2=Persona2.calculaIMC(per2.getPeso(), per2.getAltura());
		ed=Persona2.esMayorDeEdad(per.getEdad())?per.getNom()+": Es mayor de edad":per.getNom()+": Es menor de edad";
		ed2=Persona2.esMayorDeEdad(per2.getEdad())?per2.getNom()+": Es mayor de edad":per2.getNom()+": Es menor de edad";
		if (p==-1)
			pe=per.getNom()+": Esta en su peso ideal";
		else if (p==0)
			pe=per.getNom()+": Esta por debajo de su peso ideal";
		else 
			pe=per.getNom()+": Tiene sobrepeso";
		if (p2==-1)
			pe2=per2.getNom()+": Esta en su peso ideal";
		else if (p2==0)
			pe2=per2.getNom()+": Esta por debajo de su peso ideal";
		else 
			pe2=per2.getNom()+": Tiene sobrepeso";
		Tools.imprimePantalla("Datos Capturados: \n\n"+per.toString()+"\n\n"+per2.toString()+
				"\n\nPeso:\n"+pe+"\n"+pe2+"\n\n Mayor\n"+ed+"\n"+ed2);
	}
	public static void main(String[] args) {
		CapturaDatos();
	}
}
