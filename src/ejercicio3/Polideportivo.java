package ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva {
	private String nombre;
	private int tipoDeInstalacion=0;
	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + ", getTipoDeInstalacion()=" + getTipoDeInstalacion()
				+ ", getSuperficeEdificio()=" + getSuperficeEdificio() + "]";
	}

	public Polideportivo(double superficeEdificio,String nombre) {
		super(superficeEdificio);
		this.nombre= nombre;
		// TODO Auto-generated constructor stub
	}

	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		 return this.tipoDeInstalacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
