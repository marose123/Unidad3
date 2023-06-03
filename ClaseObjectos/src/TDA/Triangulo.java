package TDA;

public class Triangulo {
	
	private float base;
	private float altura;
	private float lado1;
	private float lado2;
	private float catetoO;
	private float catetoA;
	
	public Triangulo() {}
	
	public Triangulo(float base, float altura, float lado1, float lado2, float catetoO, float catetoA) {
		this.base=base;
		this.altura=altura;
		this.lado1=lado1;
		this.lado2=lado2;
		this.catetoO=catetoO;
		this.catetoA=catetoA;
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
	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	public float getLado2() {
		return lado2;
	}
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}
	public float getCatetoO() {
		return catetoO;
	}

	public void setCatetoO(float catetoO) {
		this.catetoO = catetoO;
	}

	public float getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(float catetoA) {
		this.catetoA = catetoA;
	}

	
	public static float AreaTriangulo(float base, float altura) {
		return (base*altura)/2;
	}
	public static float PerimetroTriangulo(float base, float lado1, float lado2) {
		return (base+lado1+lado2);
	}
	public static float HipotenusaTriangulo(float catetoO, float catetoA) {
		return (float) (Math.sqrt(Math.pow(catetoO, 2)+Math.pow(catetoA, 2)));
	}
	public static String TipoTriangulo(float base,float lado1, float lado2) {
		if (base==lado1 && lado1==lado2) 
			return "Equilatero";
		else if (base==lado1 || lado1==lado2 || base==lado2) 
			return "Isoceles";
		else 
			return "Escaleno";
	}
}
