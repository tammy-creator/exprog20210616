package Ejercicio1;

import java.util.Comparator;

public class Comparador implements Comparator<Automovil> {

	@Override
	public int compare(Automovil a1, Automovil a2) {
		int resultado = a1.getMotor().compareTo(a2.getMotor());
		if(resultado ==0) {
			resultado=a1.getPotencia().compareTo(a2.getPotencia());
		}		
		return resultado;
	}

}
