package TestClasesObjectos;


import EntradaSalida.Tools;
import TDA.RentaAutos;

public class TestRentaAutos {
	public static void main(String[] args) {
		CapturaRentaAutos();
	}
	public static void CapturaRentaAutos() {
		String cad= "Renta de autos\n";
		byte res=0;
		do {
		RentaAutos auto=new RentaAutos();
		auto.setTamañoAuto(Tools.leerChar("¿Que tipo de auto va rentar?: [P]equeÑo, [M]ediano, [G]rande"));
		auto.setDias(Tools.leerByte("¿Cuantos dias lo va  rentar?:"));
		auto.setKilometros(Tools.leerFloat("Kilometros recorridos:"));
		cad+="Tipo de Auto: "+auto.getTamañoAuto()+"\n";
		cad+="Dias alquilados: "+auto.getDias()+"\n";
		cad+="Kilometros Recorridos: "+auto.getKilometros()+"\n";
		cad+="Tarifa: "+auto.DeterminarTarifa()+"\n";
		cad+="Costo por kilometro: "+auto.CalcularCosto()+"\n";
		cad+="Monto a pagar: "+auto.CalcularMonto();
		res=(byte)Tools.seguirSino();
		}while(res!=1);
		Tools.imprimePantalla("Listado de persona:\n"+cad);
	}
}
