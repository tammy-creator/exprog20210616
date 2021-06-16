package Ejercicio4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Queue<Integer> cola = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(cola);
		intercalar(cola);
		System.out.println(cola);

	}
	public static void intercalar(Queue<Integer> cola) {
		if(cola.size()%2!=0) {
			throw new IllegalArgumentException();
		}
		Queue<Integer>c = new ArrayDeque<>();
		Queue<Integer>d = new ArrayDeque<>();
		int n = (cola.size()/2);
		
		while(n-- !=0) {
			c.add(cola.poll());
		}
		while(!c.isEmpty()) {
			d.add(c.poll());
			d.add(cola.poll());			
		}
		while(!d.isEmpty()) {
			cola.add(d.poll());
		}
	}
}
