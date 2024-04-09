package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 */
	private int numero;
	
	public Algoritmos(int numero) {
        this.numero = numero;
    }
	
	public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
    	this.numero = numero;
    }
	
	public static int sumatorio(int numero) {
		int sumanumero = 0;
		int total = 0;
		for (int i=0; i<numero; i++) {
			sumanumero++;
			total += sumanumero;
		}
		return total;
	}
	
	public static int factorial(int numero) {
		int factnumero = 0;
		int total = 0;
		for (int i=0; i<numero; i++) {
			factnumero++;
			total *= factnumero;
		}
		return total;
	}
	
}
