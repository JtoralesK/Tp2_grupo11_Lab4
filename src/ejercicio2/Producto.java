package ejercicio2;

import java.time.LocalDate;

public class Producto {
	
	private LocalDate fechaCaducidad;
	private int lote;
	
	public Producto()

	public Producto(LocalDate fechaCaducidad, int lote) {
		this.fechaCaducidad = fechaCaducidad;
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
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + "]";
	}
	
	
	
	
}
