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
	void factorial() {
		int factorialEsperado = 120;
		int factorialObtenido = Algoritmos.factorial(5);	
		assertEquals(factorialEsperado, factorialObtenido);
	}
}