package ejercicio3;

public class EdificioOficinas extends Edificio{
	private int oficinas;
	
	public EdificioOficinas(double superficie, int oficinas) {
		super(superficie);
		this.oficinas=oficinas;
	}
	
	public int getOficinas() {
		return oficinas;
	}

	public void setOficinas(int oficinas) {
		this.oficinas = oficinas;
	}

	@Override
	public String toString() {
		return "EdificioOficinas cantidad de oficinas: " + oficinas+ ", superficie: "+this.getSuperficeEdificio();
	}
	
	
}
