package ejercicio2;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashSet;

public class mainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// Productos Congelados
		ProductoCongelado Pc1= new ProductoCongelado("2002-01-12",3,1);
		ProductoCongelado Pc2= new ProductoCongelado("2010-01-12",6,4);
		
		ArrayList<ProductoCongelado> List_ProductoCongelado = new ArrayList<ProductoCongelado>();
		List_ProductoCongelado.add(Pc1);
		List_ProductoCongelado.add(Pc2);
		
		System.out.println("--Productos Congelados--");
		
		ListIterator<ProductoCongelado> it1 = List_ProductoCongelado.listIterator(); 
		while(it1.hasNext()) {
			ProductoCongelado pcc = it1.next();
			it1.remove();
			System.out.println(pcc);
		}
		///Producto Fresco
		ProductoFresco Pf1 = new ProductoFresco("2019-04-12",3,"2021-01-02","Peru");
		ProductoFresco Pf2= new ProductoFresco("2019-04-12",3,"2020-01-02","Paraguy");
		
		HashSet<ProductoFresco> List_ProductoFresco = new HashSet<ProductoFresco>();
		List_ProductoFresco.add(Pf1);
		List_ProductoFresco.add(Pf2);
		System.out.println("--Producto Fresco--");
		Iterator<ProductoFresco> it2 = List_ProductoFresco.iterator(); 
		while(it2.hasNext()) {
			ProductoFresco pff = (ProductoFresco) it2.next();
			it2.remove();
			System.out.println(pff);
		}
		
		///Producto Refrigerado
		ProductoRefrigerado Pr1 = new ProductoRefrigerado("2019-04-12",3,113);
		ProductoRefrigerado Pr2 = new ProductoRefrigerado("2019-04-12",3,34443);
		
		HashSet<ProductoRefrigerado> List_ProductoRefrigerado = new HashSet<ProductoRefrigerado>();
		List_ProductoRefrigerado.add(Pr1);
		List_ProductoRefrigerado.add(Pr2);
		System.out.println("--Producto Refrigerado--");
		Iterator<ProductoRefrigerado> it3 = List_ProductoRefrigerado.iterator(); 
		while(it3.hasNext()) {
			ProductoRefrigerado prr = (ProductoRefrigerado) it3.next();
			it3.remove();
			System.out.println(prr);
		}
	}

}
