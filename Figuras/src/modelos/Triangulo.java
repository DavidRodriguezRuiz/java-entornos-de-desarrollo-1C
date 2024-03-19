package modelos;
import java.util.*;
public class Triangulo {

    /**
     * Default constructor
     */
    private int base;
    private int altura;
	
    /**
     * Constructor por defecto con las demás variables.
     * @param base 
     * @param altura
     */
    public void Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Triangulo() {
    	this.base = 1;
        this.altura = 1;
    }
    
    /**
     * Obtener la variable "Base".
     * @return
     */
    public int getBase() {
        return base;
    }

    /**
     * Modificar la variable "Base".
     * @param base
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Obtener la variable "Altura".
     * @return
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Modificar la variable "Altura".
     * @param altura
     */
    public void setAltura(int altura) {
        // TODO implement here
    }

    /**
     * Calcular el area de un triangulo.
     * ((Base) * (Altura)/2)
     * @return
     */
    public int area() {
    	return ((base) * (altura)/2);
    }

}