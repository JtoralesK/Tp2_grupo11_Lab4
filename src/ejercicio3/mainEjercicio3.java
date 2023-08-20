package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {
	public static void main (String[] args) {
		 ArrayList<Edificio> edificios = new ArrayList<Edificio>();
		 edificios.add(new Polideportivo(1000.2,"Polideportivo A")) ;
		 edificios.add(new Polideportivo(2100,"Polideportivo B")) ;
		 edificios.add(new Polideportivo(505.2,"Polideportivo C")) ;

		 edificios.add(new EdificioOficinas(505.2,20)) ;
		 edificios.add(new EdificioOficinas(505.2,10)) ;
		Iterator<Edificio> iterador = edificios.iterator();
			while (iterador.hasNext()) {
				Edificio edificio = iterador.next();
				System.out.println(edificio.toString());
			}
	}

}
