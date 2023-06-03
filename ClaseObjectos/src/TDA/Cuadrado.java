
package TDA;

public class Cuadrado {
	private float lado;
	public Cuadrado() {}
	public Cuadrado(float lado) {
		this.lado = lado;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	public static float AreaCuadrado(float lado) {
		return (float) (Math.pow(lado, 2));
	}
	public static float PerimetroCuadrado(float lado) {
		return (lado*4);
	}
}
