	package TDA;

	public class RentaAutos {
		private char tamañoAuto;
		private byte dias;
		private float kilometros;
		public RentaAutos() {}
		public RentaAutos(char tamañoAuto, byte dias, float kilometros) {
			this.tamañoAuto = tamañoAuto;
			this.dias = dias;
			this.kilometros = kilometros;
		}
		public char getTamañoAuto() {
			return tamañoAuto;
		}
		public void setTamañoAuto(char tamañoAuto) {
			this.tamañoAuto = tamañoAuto;
		}
		public byte getDias() {
			return dias;
		}
		public void setDias(byte dias) {
			this.dias = dias;
		}
		public float getKilometros() {
			return kilometros;
		}
		public void setKilometros(float kilometros) {
			this.kilometros = kilometros;
		}
		public double DeterminarTarifa() {
			double tarifa=0;
			if(tamañoAuto=='P'||tamañoAuto=='p') 
				tarifa=200*dias;
			else if (tamañoAuto=='M'||tamañoAuto=='m') 
				tarifa=350*dias;
			else if (tamañoAuto=='G'||tamañoAuto=='g') 
				tarifa=450*dias;
			return tarifa;
		}
		public double CalcularCosto() {
			double costo=0;
			if(tamañoAuto=='P'||tamañoAuto=='p') 
				costo=kilometros*20;
			else if (tamañoAuto=='M'||tamañoAuto=='m') 
				costo=kilometros*30;
			else if (tamañoAuto=='G'||tamañoAuto=='g') 
				costo=kilometros*40;
			return costo;
		}
		public double CalcularMonto() {
			double monto=CalcularCosto();
			if(kilometros>10) 
				monto+=CalcularCosto()*0.025;
			monto+=DeterminarTarifa();
			return monto;
		}
	}


