package ejercicio2;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
	
	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco()
	{
		super();
		
	}

	public ProductoFresco(LocalDate fechaCaducidad, int lote, LocalDate envasado, String origen) {
		super(fechaCaducidad, lote);
		this.fechaEnvasado = envasado;
		this.paisOrigen = origen;
	}
	
	
}
