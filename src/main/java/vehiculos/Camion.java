package vehiculos;

public class Camion extends Vehiculo{
	protected int ejes;
	public static int numCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso,Fabricante fabricante,int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		numCamiones++;	
	}
	
	public Camion() {
		
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getNumCamiones() {
		return numCamiones;
	}

	public static void setNumCamiones(int numCamiones) {
		Camion.numCamiones = numCamiones;
	}
	
	
}
