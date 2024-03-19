package modelos;
import java.util.*;

public class Rectangulo {

    /**
     * Default constructor
     */
    private int base;
    private int altura;
	
    public Rectangulo() {
    	this.base = 1;
        this.altura = 1;
    }
    /**
     * Constructor por defecto con las demás variables.
     * @param base 
     * @param altura
     */
    public void Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void Rectangulo() {
        // TODO implement here
    }

    /**
     * Obtener la variable "Base".
     * @return
     */
    public int getBase() {
        // TODO implement here
        return 0;
    }

    /**
     * Modificar la variable "Base".
     * @param base
     */
    public void setBase(int base) {
        // TODO implement here
    }

    /**
     * Obtener la variable "Altura".
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return 0;
    }

    /**
     * Modificar la variable "Altura".
     * @param altura
     */
    public void setAltura(int altura) {
        // TODO implement here
    }

    /**
     * Calcular el area de un rectangulo.
     * (Base * Altura)
     * @return
     */
    public int area() {
        return base * altura;
    }

    /**
     * Calcular el perimetro de un rectangulo.
     * ((Base * 2) + (2* Altura))
     * @return
     */
    public int perimetro() {    
        return ((2*base) + (2*altura));
    }

}