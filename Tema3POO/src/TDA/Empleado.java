package TDA;

public class Empleado {
	public String nombEmp;
	public byte edadEmp;
	public byte hrstrabEmp;
	public double pagohrsEmp;
	
	public Empleado(String nombEmp, byte edadEmp, byte hrstrabEmp, double pagohrsEmp) {
		this.nombEmp = nombEmp;
		this.edadEmp = edadEmp;
		this.hrstrabEmp = hrstrabEmp;
		this.pagohrsEmp = pagohrsEmp;
	}

	public String getNombEmp() {
		return nombEmp;
	}

	public void setNombEmp(String nombEmp) {
		this.nombEmp = nombEmp;
	}

	public byte getEdadEmp() {
		return edadEmp;
	}

	public void setEdadEmp(byte edadEmp) {
		this.edadEmp = edadEmp;
	}

	public byte getHrstrabEmp() {
		return hrstrabEmp;
	}

	public void setHrstrabEmp(byte hrstrabEmp) {
		this.hrstrabEmp = hrstrabEmp;
	}

	public double getPagohrsEmp() {
		return pagohrsEmp;
	}

	public void setPagohrsEmp(double pagohrsEmp) {
		this.pagohrsEmp = pagohrsEmp;
	}
	public static Empleado mayorEdad(Empleado emp1, Empleado emp2) {
		return (emp1.edadEmp>= emp2.edadEmp)? emp1:emp2;
	}
	public static Empleado mayorHrsTrabajas(Empleado emp1, Empleado emp2) {
		return (emp1.hrstrabEmp>= emp2.hrstrabEmp)? emp1:emp2;
	}
		
	}
		
		
	


