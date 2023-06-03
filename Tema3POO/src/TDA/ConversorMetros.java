package TDA;

public class ConversorMetros {
	private static final double FACTOR_METROS_MILIM = 0;
	double metros;
	final int FACTOR_METROS_CM = 100;
	final int FACTOR_METROS_MILIM_ = 100;
	final double FACTOR_METROS_PULGAFAS = 39.37;
	final double FACTOR_METROS_PIES = 3.28;
	final double FACTOR_METROS_YARDAS = 1.09361;
	
	public ConversorMetros(double metros) {
		this.metros = metros;
	}
	public double convertirMetrosToCentrimetos() {
		double centimetros;
		centimetros = FACTOR_METROS_CM * metros;
		return centimetros;
	}
	public double convertirMetrosToMilimetros() {
		double milimetros;
		milimetros = FACTOR_METROS_MILIM * metros;
		return milimetros;
	}
	}


