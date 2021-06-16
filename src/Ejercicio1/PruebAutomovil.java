package Ejercicio1;

import java.util.Set;
import java.util.TreeSet;

public class PruebAutomovil {

	public static void main(String[] args) {
		
		Set<Automovil> automoviles = new TreeSet<>();
		automoviles.add(new Automovil("Seat","Ibiza","1245LJK",2021,"GASOLINA","120CV"));
		automoviles.add(new Automovil("Opel","Corsa","5245HJL",2019,"DIESEL","300CV"));
		automoviles.add(new Automovil("Audi","A4","4589GMN",2015,"HIBRIDO","180CV"));
		automoviles.add(new Automovil("Renault","Megane","4567CCY",2017,"GASOLINA","90CV"));
		automoviles.add(new Automovil("Mercedes","Vito","7895BPP",2014,"DIESEL","120CV"));
		
		Set<Automovil> automoviles1 = new TreeSet<>(new Comparador());
		automoviles1.addAll(automoviles);
		System.out.println(automoviles);
		System.out.println(automoviles1);
		

	}

}
