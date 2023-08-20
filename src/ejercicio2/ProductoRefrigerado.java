package ejercicio2;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{

	private int codigoRegulatorio;
	
	public ProductoRefrigerado()
	{
		super();
		this.codigoRegulatorio=0;
	}

	public ProductoRefrigerado(String fechaCaducidad, int lote, int codigoRegulatorio) {
		super(fechaCaducidad, lote);
		this.codigoRegulatorio = codigoRegulatorio;
	}

	public int getCodigoRegulatorio() {
		return codigoRegulatorio;
	}

	public void setCodigoRegulatorio(int codigoRegulatorio) {
		this.codigoRegulatorio = codigoRegulatorio;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoRegulatorio=" + codigoRegulatorio + ", " + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoRegulatorio;
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
		ProductoRefrigerado other = (ProductoRefrigerado) obj;
		if (codigoRegulatorio != other.codigoRegulatorio)
			return false;
		return true;
	}

}
