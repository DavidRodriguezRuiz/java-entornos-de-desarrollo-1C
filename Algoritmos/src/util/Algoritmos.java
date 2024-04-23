package util;

public abstract class Algoritmos {

	/**
	 * Devuelve las operaciones del numero especificado.
	 * 
	 * @param numero	el numero del que queremos calcular las operaciones.
	 * @return			el total del numero especificado de las operaciones.
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
	
    /**
     * Devuelve el sumatorio del numero especificado.
     * 
     * @param numero	el numero del que queremos calcular el sumatorio.
     * @return			total del sumatorio del numero especificado.
     */
	public static int sumatorio(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("El número debe ser igual o superior a 0.");
		}
		int total = 0;
		for (int i=1; i<=numero; i++) {
			total = total + i;
		}
		return total;
	}
	
    /**
     * Devuelve el factorial del numero especificado.
     * 
     * @param numero	el numero del que queremos calcular el factorial.
     * @return			total del factorial del numero especificado.
     */
	public static int factorial(int numero) {
		int total = 1;
		for (int i=1; i<=numero; i++) {
			total = total * i;
		}
		return total;
	}
	
}
