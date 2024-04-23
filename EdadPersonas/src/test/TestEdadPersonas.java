package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import models.Persona;

class TestEdadPersonas {

	/**
	 * Devuelve un mensaje si la variable edad si está en el rango indicado. (De 0 a 130)
	 * Variable edad = 0
	 */
	@Test
	void testPersona0() {
		Persona p = new Persona ("nombre", "apellidos", 0);
		String esperado = "Menor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un mensaje si la variable edad si está en el rango indicado. (De 0 a 130)
	 * Variable edad = 17
	 */
	@Test
	void testPersona17() {
		Persona p = new Persona ("nombre", "apellidos", 17);
		String esperado = "Menor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un mensaje si la variable edad si está en el rango indicado. (De 0 a 130)
	 * Variable edad = 18
	 */
	@Test
	void testPersona18() {
		Persona p = new Persona ("nombre", "apellidos", 18);
		String esperado = "Mayor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un mensaje si la variable edad si está en el rango indicado. (De 0 a 130)
	 * Variable edad = 65
	 */
	@Test
	void testPersona65() {
		Persona p = new Persona ("nombre", "apellidos", 65);
		String esperado = "Mayor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un mensaje si la variable edad si está en el rango indicado. (De 0 a 130)
	 * Variable edad = 66
	 */
	@Test
	void testPersona66() {
		Persona p = new Persona ("nombre", "apellidos", 66);
		String esperado = "Jubilado.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un mensaje si la variable edad si está en el rango indicado. (De 0 a 130)
	 * Variable edad = 130
	 */
	@Test
	void testPersona130() {
		Persona p = new Persona ("nombre", "apellidos", 130);
		String esperado = "Jubilado.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un error si la variable edad no está en el rango indicado. (De 0 a 130)
	 * Variable edad = -1
	 */
	@Test
	void testPersonaEdadInvalidaMenos1() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
			() -> new Persona("nombre", "apellidos", -1));
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Devuelve un error si la variable edad no está en el rango indicado. (De 0 a 130)
	 * Variable edad = 131
	 */
	@Test
	void testPersonaEdadInvalida131() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
			() -> new Persona("nombre", "apellidos", 131));
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}

}
