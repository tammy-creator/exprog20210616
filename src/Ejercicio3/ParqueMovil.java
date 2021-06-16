package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ParqueMovil {
	HashMap<String,ArrayList<Integer>> vehiculos;
	String provincia;
	
	public ParqueMovil(File file, int anio) {
		String ruta = file.getName()+anio+".csv";
		File fichero = new File(ruta);
		String[]tipo = {"camiones","furgonetas","autobuses","turismos","motocicletas","tractores"};
		ArrayList<Integer>numVehiculos = new ArrayList<>();
		if(!fichero.exists()) {
			System.out.println("No se ha encontrado el fichero");
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String linea = null;
			while((linea=br.readLine()) != null) {
				String[] campos = linea.split(",");
				for(int i=1;i<tipo.length;i++) {
					for(int j=1; j<campos.length; j++) {
						numVehiculos.add(Integer.parseInt(campos[j]));
						this.vehiculos.put(tipo[i], numVehiculos);
					}					
				}
				this.provincia=campos[0];
				
				linea=br.readLine();				
			}
			br.close();
		}catch(IOException e){
            System.out.println(e.getMessage());
        }
	}

	public void numVehiculos(String provincia,  String tipoVehiculo) {
		Integer suma=0;
		if(provincia==this.provincia){
			Iterator<Integer> it = vehiculos.get(tipoVehiculo).iterator();
			while(it.hasNext()) {
				suma += it.next();
			}
		}
		System.out.println("El número de "+tipoVehiculo+" en "+provincia+"es de: "+ suma);
	}
	
	public void totalVehiculos(String provincia) {
		Integer suma=0;
		if(provincia==this.provincia){
			for(ArrayList<Integer> f: vehiculos.values()) {
				Iterator<Integer> it = f.iterator();
				while(it.hasNext()) {
					suma+=it.next();
				}
			}
		}
		System.out.println("El número total de vehiculos en "+provincia+"es de: "+ suma);
	}
		
}
