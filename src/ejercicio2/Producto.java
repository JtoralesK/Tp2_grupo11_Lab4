package ejercicio2;

import java.time.LocalDate;

public abstract class Producto {
	
	private LocalDate fechaCaducidad;
	private int lote;
	
	public Producto() {
		String fecha="0000-00-00" ;
		this.fechaCaducidad=LocalDate.parse(fecha);
		this.lote=0;
	}


	public Producto(String fechaCaducidad, int lote) {
		this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
		this.lote = lote;
	}
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	
	@Override
	public String toString() {
		return "Fechade caducidad:" + fechaCaducidad + ", lote:" + lote + "";
	}
	
	
	
	
}
