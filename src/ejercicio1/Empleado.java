package ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int proximoId = 1000;
	
	public Empleado()
	{
		id = proximoId;
		nombre = "sin nombre";
		edad = 99;
		proximoId++;
	}
	
	public Empleado(String nombre, int edad)
	{
		id = proximoId;
		this.nombre = nombre;
		this.edad = edad;
		proximoId++;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static String devuelveProximoID()
	{
		return "El próximo ID será el " + proximoId;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre + ", edad: " + edad + ", legajo: " + id;
	}
	
	
	
}
