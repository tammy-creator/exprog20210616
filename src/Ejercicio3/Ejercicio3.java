package Ejercicio3;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ParqueMovil> parquemoviles = new TreeSet<>();
		File file = new File("C:\\Users\\alumno\\Desktop\\pm");
		parquemoviles.add(new ParqueMovil(file, 2018));
	}

}
