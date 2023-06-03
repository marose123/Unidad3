
package TDA;

public class Circulo {
	private float radio;
	
	public Circulo() {}
	
	public Circulo(float radio) {
		this.radio=radio;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	public static float AreaCirculo(float radio) {
		return (float) (Math.PI*Math.pow(radio, 2));
	}
	public static float PerimetroCirculo(float radio) {
		return (float) Math.PI*(radio*2);
	}
}
