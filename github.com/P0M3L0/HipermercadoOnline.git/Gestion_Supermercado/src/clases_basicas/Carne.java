package clases_basicas;

public class Carne extends Comida {
	
	tipo_carne tipocarne;
	
	
	public enum tipo_carne {
		
		Pollo, Ternera, Cerdo, Pato, Conejo
	}

	public Carne(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, tipo_carne tipocarne) {
		super(kcal, precio_ud, true, "Carne");
		this.tipocarne = tipocarne;
	
	}

}
