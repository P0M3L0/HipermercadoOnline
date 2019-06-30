package clases_basicas;

public class Pasta extends Comida {
	
	tipo_pasta tipopasta;
	boolean pastaelGallo;
	
	public enum tipo_pasta{
		
		Canelones, Tortellini, Espagueti, Fideos, Lasanya, Macarrones, Ravioli, Tallarines
	}

	public Pasta(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, tipo_pasta tipopasta, boolean pastaelGallo) {
		super(kcal, precio_ud, false, "Pasta");
		this.tipopasta = tipopasta;
		this.pastaelGallo = pastaelGallo;
	}

}
