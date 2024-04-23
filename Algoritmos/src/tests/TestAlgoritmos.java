package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import util.Algoritmos;

public class TestAlgoritmos {
			
	@Test
	void sumatorio() {
		int sumaEsperada = 15;
		int sumaObtenida = Algoritmos.sumatorio(5);	
		assertEquals(sumaEsperada, sumaObtenida);
	}
	
	@Test
	void sumatorioParamIncorrecto() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
			() -> Algoritmos.sumatorio(-1));	
		String esperado = "El número debe ser igual o superior a 0.";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void factorial() {
		int factorialEsperado = 120;
		int factorialObtenido = Algoritmos.factorial(5);	
		assertEquals(factorialEsperado, factorialObtenido);
	}
}