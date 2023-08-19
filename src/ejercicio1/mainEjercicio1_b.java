package ejercicio1;


import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new Profesor("pablo", 10, "matematica", 3);
		Profesor p2 = new Profesor("pabla", 15, "lengua", 5);
		Profesor p3 = new Profesor("juan", 20, "geografia", 7);
		Profesor p4 = new Profesor("juana", 25, "historia", 9);
		Profesor p5 = new Profesor("mario", 30, "fisica", 11);
		
		TreeSet<Profesor> lista = new TreeSet<Profesor>();
		lista.add(p4);
		lista.add(p2);
		lista.add(p5);
		lista.add(p1);
		lista.add(p3);
		
		Iterator<Profesor> it = lista.iterator();
		while(it.hasNext()) {
			Profesor aux = it.next();
			System.out.println(aux.toString());
		}
		
		Profesor p6 = new Profesor("maria", 30, "fisica", 11);
		Profesor p7 = new Profesor("maria", 30, "fisica", 11);
		
		if(p6.equals(p7)) System.out.println("Es el mismo profesor.");
	}

}
