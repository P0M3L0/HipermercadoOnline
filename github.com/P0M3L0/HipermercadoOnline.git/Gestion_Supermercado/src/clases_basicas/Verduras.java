package clases_basicas;

public class Verduras extends Comida {
	
	boolean es_nacional;
	tipo_verduras tipoverduras;
	String nombre_verduras;
	
	public enum tipo_verduras{
		
		Raiz, Bulbo, Tallo, Hoja, Flor
	}

	public Verduras(int kcal, int precio_ud, boolean es_fresco, String nombre_comida, boolean es_nacional, tipo_verduras tipoverduras, String nombre_verduras) {
		super(kcal, precio_ud, true, "Verduras");
		this.es_nacional = es_nacional;
		this.tipoverduras = tipoverduras;
		this.nombre_verduras = nombre_verduras;
	}

}
