package ejercicio2;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	private int temperaturaCongelacion;
	
	public ProductoCongelado()
	{
		super();
		
	}

	public ProductoCongelado(LocalDate fechaCaducidad, int lote, int temperaturaCongelacion) {
		super(fechaCaducidad, lote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}
}
