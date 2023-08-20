package ejercicio2;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	private int temperaturaCongelacion;
	
	public ProductoCongelado()
	{
		super();
		this.temperaturaCongelacion=0;
	}

	public ProductoCongelado(String fechaCaducidad, int lote, int temperaturaCongelacion) {
		super(fechaCaducidad, lote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	public int getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(int temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	@Override
	public String toString() {
		return "ProductoCongelado [temperatura Congelacion=" + temperaturaCongelacion + ", Fecha Caducidad()="
				+ getFechaCaducidad() + ", Lote()=" + getLote() + "]";
	}
	
	
	
	
}
