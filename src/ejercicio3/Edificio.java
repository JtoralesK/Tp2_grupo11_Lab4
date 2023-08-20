package ejercicio3;

public class Edificio {

	private double superficeEdificio;
	@Override
	public String toString() {
		return "Edificio [superficeEdificio=" + superficeEdificio + "]";
	}

	public double getSuperficeEdificio() {
		return superficeEdificio;
	}

	public void setSuperficeEdificio(double superficeEdificio) {
		this.superficeEdificio = superficeEdificio;
	}

	public Edificio(double superficeEdificio) {
		this.superficeEdificio = superficeEdificio;
	}
}
