package models;

public class Persona {
	
	String nombre;
	String apellidos;
	int edad;
	
	/**
     * Constructor que asigna las variables.
     * 
     * @param nombre 		El nombre de la persona.
     * @param apellidos.	Los apellidos de la persona.
     * @param edad			La edad de la persona.
     */
	public Persona(String nombre, String apellidos, int edad) {
		if (edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130.");
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public String getNombre() {
        return nombre;
    }
	
	public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
	
	public String getApellidos() {
        return apellidos;
    }
	
	public void setApellidos(String apellidos) {
    	this.apellidos = apellidos;
    }
	
	public int getEdad() {
        return edad;
    }
	
	public void setEdad(int edad) {
    	this.edad = edad;
    }
	
	/**
     * Devuelve un mensaje según la edad.
     * 
     * @return			mensaje obtenido al haber introducido la edad.
     */
	public String mostrarEdad() {
		String frase = "";
		if (edad >= 0 && edad < 18) {
			frase = "Menor de edad.";
		} else if (edad >= 18 && edad <= 65) {
			frase = "Mayor de edad.";
		} else if (edad > 65 && edad <= 130) {
			frase = "Jubilado.";
		}
		return frase;
	}
}
