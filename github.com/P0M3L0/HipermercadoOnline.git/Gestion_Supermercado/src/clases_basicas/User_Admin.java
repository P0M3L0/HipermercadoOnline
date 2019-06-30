package clases_basicas;

public class User_Admin extends User {
	
	int sueldo;
	String genero;
	

	public User_Admin(String nombre, String apellido_1, String apellido_2, int edad, boolean es_admin, String nif,
			String num_telefono, String User_name, String password, int sueldo, String genero) {
		super(nombre, apellido_1, apellido_2, edad, true, nif, num_telefono, User_name, password);
		this.sueldo = sueldo;
		this.genero = genero;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	
}
