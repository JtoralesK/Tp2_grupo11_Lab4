package ejercicio2;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{

	private int codigoRegulatorio;
	
	public ProductoRefrigerado()
	{
		super();
		
	}

	public ProductoRefrigerado(LocalDate fechaCaducidad, int lote, int codigoRegulatorio) {
		super(fechaCaducidad, lote);
		this.codigoRegulatorio = codigoRegulatorio;
	}
}
