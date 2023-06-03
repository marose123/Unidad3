
package TDA;

public class Persona {
// atributos
	private String nomPer;
	private double telPers;
	private byte edadPers;
	private String nacioPer;
	private Fecha fechPer;
	private char genePer;
	//constructor vacio
	public Persona() {	}
	//constructor parametrizado
	public Persona(String nomPer, int telPers, byte edadPers, String nacioPer, Fecha fechPer, char genePer) {
		
		this.nomPer = nomPer;
		this.telPers = telPers;
		this.edadPers = edadPers;
		this.nacioPer = nacioPer;
		this.fechPer = fechPer;
		this.genePer = genePer;
		
	}
	//encapsulamiento
	public String getNomPer() {
		return nomPer;
	}
	public double getTelPers() {
		return telPers;
	}
	public void setTelPers(int telPers) {
		this.telPers = telPers;
	}
	public byte getEdadPers() {
		return edadPers;
	}
	public void setEdadPers(byte edadPers) {
		this.edadPers = edadPers;
	}
	public String getNacioPer() {
		return nacioPer;
	}
	public void setNacioPer(String nacioPer) {
		this.nacioPer = nacioPer;
	}
	public Fecha getFechPer() {
		return fechPer;
	}
	public void setFechPer(Fecha fechPer) {
		this.fechPer = fechPer;
	}
	public char getGenePer() {
		return genePer;
	}
	public void setGenePer(char genePer) {
		this.genePer = genePer;
	}
	public void setNomPer(String nomPer) {
		this.nomPer = nomPer;
	}
	//Generar el metodo toString
	@Override
	public String toString() {
		return "Persona [nomPer=" + nomPer + "telPers=" + telPers + "edadPers=" + edadPers + "nacioPer="
				+ nacioPer + "fechPer=" + fechPer + "genePer=" + genePer + "]";
	}
	
}
