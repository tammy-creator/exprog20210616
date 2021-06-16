package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("banana");
		lista.add("pera");
		lista.add("malon");
		lista.add("o");
		lista.add("sandia");
		System.out.println(cuentaPares(lista));
		
		
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		lista2.add(3);
		System.out.println("Las dos listas tienen en común "+contarComunes(lista1, lista2)+" números repetidos");
	}
	
	public static Map<String,Integer> cuentaPares(List<String> lista) {
		Map<String, Integer> contador = new HashMap<>();
		String aux;
		for(String palabra:lista) {
			for(int i=0;i<palabra.length()-1;i++) {
				if(palabra.length()>1) {
					aux=palabra.substring(i,i+2);
					if(!contador.containsKey(aux)) {
						contador.put(aux, 1);
					}else {
						contador.put(aux, contador.get(aux)+1);
					}
				}
				
			}
		}
		return contador;
	}
	
	public static int contarComunes(List<Integer>lista1, List<Integer>lista2) {
		int repetidos=0;
		Set<Integer> lista1NoRep = new HashSet<>(lista1);
		Set<Integer> lista2NoRep = new HashSet<>(lista2);
		Iterator<Integer> it = lista1NoRep.iterator();
		while(it.hasNext())
			if(lista2NoRep.contains(it.next())) {
				repetidos++;
			}
		return repetidos;
	}
}
