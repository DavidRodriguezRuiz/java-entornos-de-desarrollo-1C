package modelos;
import java.util.*;
public class Circulo {

    /**
     * Default constructor
     */
	private double radio;
	
	/**
     * Constructor por defecto con las demás variables.
     * @param radio
     */
    public void Circulo(int radio) {
        this.radio = radio;
    }
	
    public Circulo() {
    	this.radio = 1;
    }

    /**
     * Obtener la variable "Radio".
     * @return
     */
    public double getRadio() {
        // TODO implement here
        return radio;
    }

    /**
     * Modificar la variable "Radio".
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcular el area de un circulo.
     * (Pi * Radio^2)
     */
    public double area() {
        return (3.14 * (radio));
    }

    /**
     * Calcular el perimetro de uncirculo.
     * (2*Pi * Radio)
     */
    public double perimetro() {
        return ((2*3.14) * radio);
    }

}