package clases_basicas;

public class Pescado extends Comida {

	tipo_pescado tipopescado;
	boolean piscifactoria;
	
	public enum tipo_pescado {
		
		Blanco, Azul
	}
	
	
	public Pescado(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, tipo_pescado tipopescado, boolean piscifactoria) {
		super(kcal, precio_ud, true, "Pescado");
		this.tipopescado = tipopescado;
		this.piscifactoria = piscifactoria;
	}

}
