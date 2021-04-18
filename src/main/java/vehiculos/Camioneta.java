package vehiculos;

public class Camioneta extends Vehiculo{
	protected boolean volco;
	public static int numCamionetas;
	
	/*String placa, int puertas, int velMaxima, String nombre, int precio, int peso,String traccion, Fabricante fabricante*/
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,Fabricante fabricante,boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		numCamionetas++;
		
	}
	
	public Camioneta() {
		
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public int getNumCamionetas() {
		return numCamionetas;
	}

	public void setNumCamionetas(int numCamionetas) {
		this.numCamionetas = numCamionetas;
	}
	
	

}
