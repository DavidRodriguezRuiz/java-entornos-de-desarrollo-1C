
import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * @param dni 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Obtiene el DNI de una persona.
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     * Modifica el DNI de una persona.
     * @param dni
     */
    public void setDni(String dni) {
    	this.dni = dni;
    }

    /**
     * Obtiene el nombre de una persona.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de una persona.
     * @param nombre
     */
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos de una persona.
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Modifica los apellidos de una persona.
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
    	this.apellidos = apellidos;
    }

    /**
     * Obtiene la edad de una persona.
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad de una persona.
     * @param edad
     */
    public void setEdad(int edad) {
    	this.edad = edad;
    }

}