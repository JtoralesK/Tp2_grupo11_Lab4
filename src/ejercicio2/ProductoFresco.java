package ejercicio2;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
	
	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco()
	{
		super();
		String fecha="0000-00-00" ;
		this.fechaEnvasado=LocalDate.parse(fecha);
		this.paisOrigen="No tiene";
	}

	public ProductoFresco(String fechaCaducidad, int lote, String envasado, String origen) {
		super(fechaCaducidad, lote);
		this.fechaEnvasado = LocalDate.parse(envasado);
		this.paisOrigen = origen;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductoFresco [Fecha Envasado=" + fechaEnvasado + ", Pais de Origen=" + paisOrigen + ", "+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaEnvasado == null) ? 0 : fechaEnvasado.hashCode());
		result = prime * result + ((paisOrigen == null) ? 0 : paisOrigen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoFresco other = (ProductoFresco) obj;
		if (fechaEnvasado == null) {
			if (other.fechaEnvasado != null)
				return false;
		} else if (!fechaEnvasado.equals(other.fechaEnvasado))
			return false;
		if (paisOrigen == null) {
			if (other.paisOrigen != null)
				return false;
		} else if (!paisOrigen.equals(other.paisOrigen))
			return false;
		return true;
	}
	
	
	
	
}
