
package TDA;

public class Rectangulo {
	private float base;
	private float altura;
	public Rectangulo() {}
	public Rectangulo(float base, float altura) {
		this.base=base;
		this.altura=altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	public static float AreaRectangulo(float base, float altura) {
		return (base*altura);
	}
	public static float PerimetroRectangulo(float base, float altura) {
		return ((base*altura)*2);
	}
}

