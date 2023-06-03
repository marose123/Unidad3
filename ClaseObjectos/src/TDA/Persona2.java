
package TDA;

public class Persona2 {
	private String nom;
	private byte edad;
	private char sex;
	private float peso;
	private float altura;
	public Persona2() {}
	public Persona2(String nom, byte edad, char sex, float peso, float altura) {
		this.nom=nom;
		this.edad=edad;
		this.sex=sex;
		this.peso=peso;
		this.altura=altura;
	}
	public Persona2(String nom, byte edad, char sex) {
		this.nom=nom;
		this.edad=edad;
		this.sex=sex;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public static byte calculaIMC(float peso, float altura) {
		float p;
		byte a=0;
		p=peso/((float)Math.pow(altura, 2));
		if(p<20)
			a=-1;
		else if (p>=20 && p<=25)
			a=0;
		else if (p>25)
			a=1;
		return a;
	}
	public static boolean esMayorDeEdad(byte edad) {
		return (edad>=18);
	}
	public String toString() {
		return "Persona [nom=" + nom + ", edad=" + edad + ", sex=" + sex + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}
	
}
