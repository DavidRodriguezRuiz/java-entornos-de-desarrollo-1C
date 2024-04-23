package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import models.Persona;

class TestEdadPersonas {

	@Test
	void testPersona0() {
		Persona p = new Persona ("nombre", "apellidos", 0);
		String esperado = "Menor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersona17() {
		Persona p = new Persona ("nombre", "apellidos", 17);
		String esperado = "Menor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersona18() {
		Persona p = new Persona ("nombre", "apellidos", 18);
		String esperado = "Mayor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersona65() {
		Persona p = new Persona ("nombre", "apellidos", 65);
		String esperado = "Mayor de edad.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersona66() {
		Persona p = new Persona ("nombre", "apellidos", 66);
		String esperado = "Jubilado.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersona130() {
		Persona p = new Persona ("nombre", "apellidos", 130);
		String esperado = "Jubilado.";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdadInvalidaMenos1() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
			() -> new Persona("nombre", "apellidos", -1));
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdadInvalida131() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
			() -> new Persona("nombre", "apellidos", 131));
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}

}
