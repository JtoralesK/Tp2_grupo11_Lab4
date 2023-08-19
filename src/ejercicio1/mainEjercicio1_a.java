package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new Profesor("pablo", 10, "matematica", 3);
		Profesor p2 = new Profesor("pabla", 15, "lengua", 5);
		Profesor p3 = new Profesor("juan", 20, "geografia", 7);
		Profesor p4 = new Profesor("juana", 25, "historia", 9);
		Profesor p5 = new Profesor("mario", 30, "fisica", 11);
		
		ArrayList<Profesor> lista = new ArrayList<Profesor>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		ListIterator<Profesor> it = lista.listIterator();
		
		while(it.hasNext()) {
			Profesor aux = it.next();
			System.out.println(aux.toString());
		}
		
	}

}
