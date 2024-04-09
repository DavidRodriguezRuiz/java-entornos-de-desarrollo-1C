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
		int sumaEsperada = 136;
		int sumaObtenida = Algoritmos.factorial(5);	
		assertEquals(sumaEsperada, sumaObtenida);
	}
}