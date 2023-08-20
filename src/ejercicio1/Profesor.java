package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor()
	{
		super();
		cargo = "Sin cargo";
		antiguedadDocente = 0;
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente)
	{
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() {
		return "Profesor Id: " + getId() + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + 
				", cargo: " + cargo + ", antiguedadDocente: " + antiguedadDocente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getEdad();
		result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
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
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (getEdad() != other.getEdad())
			return false;
		if (getNombre() == null) {
			if (other.getNombre() != null)
				return false;
		} else if (!getNombre().equals(other.getNombre()))
			return false;
		return true;
	}

	@Override
	public int compareTo(Profesor profesor) {
		
		if(this.getId() == profesor.getId())
			return 0;
		
		if(this.getId() < profesor.getId())
			return -1;
		
		return 1;
	}
	
	
}
