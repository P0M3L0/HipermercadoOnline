package clases_basicas;

public class User_Cliente extends User {
	
	int numero_integrantes_familia;
	Integer presupuesto;
	String provincia;

	public User_Cliente(String nombre, String apellido_1, String apellido_2, int edad, boolean es_admin, String nif,
			String num_telefono, String User_name, String password, int numero_integrantes_familia, Integer presupuesto, String provincia) {
		super(nombre, apellido_1, apellido_2, edad, false, nif, num_telefono, User_name, password);
		this.numero_integrantes_familia = numero_integrantes_familia;
		this.presupuesto = presupuesto;
		this.provincia = provincia;
		
	}

	public int getNumero_integrantes_familia() {
		return numero_integrantes_familia;
	}



	public void setNumero_integrantes_familia(int numero_integrantes_familia) {
		this.numero_integrantes_familia = numero_integrantes_familia;
	}



	public Integer getPresupuesto() {
		return presupuesto;
	}



	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = (1000 + (numero_integrantes_familia * 1000));
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	

}
