package modelos;
import java.util.*;
public class Rectangulo {

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
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void Rectangulo() {
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
        this.altura = altura;
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