
package TDA;

public class Fecha {
	//atributos
		private byte dia;
		private byte mes;
		private short año;
		//Constructor vacio
		public Fecha() {}
		//Constructor parametrizado
		public Fecha(byte dia,byte mes,short año) 
		{
			this.dia=dia;
			this.año=año;
			this.mes=mes;
		}
		//Encapsular
		public void setDia(byte dia) {
			this.dia=dia;
		}
		public byte getDia() {
			return dia;
		}
		public byte getMes() {
			return mes;
		}
		public void setMes(byte mes) {
			this.mes = mes;
		}
		public short getAño() {
			return año;
		}
		public void setAño(short año) {
			this.año = año;
		}
		@Override
		public String toString() {
			return "Fecha [dia=" + dia + ", mes=" + mes + ", aÃ±io=" + año + "]";
		}
}
//Falta toString en fecha