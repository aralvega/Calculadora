package ar.edu.unju.fi.aplicacion.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora unaCalculadora;

	@BeforeEach
	public void setup() {
		unaCalculadora = new Calculadora();
	}
		
	@Test
	void sumarUnidadesMinimas() {
		assertEquals(2, unaCalculadora.sumar(1,1));
	}
	
	@Test
	void sumarUnidadesMaximas() {
		assertEquals(Integer.MAX_VALUE-1, unaCalculadora.sumar(Integer.MAX_VALUE/2,Integer.MAX_VALUE/2));
	}
	
	@Test
	void sumarUnidadesExtremas() {
		assertEquals(Integer.MAX_VALUE, unaCalculadora.sumar(1,Integer.MAX_VALUE-1));
	}
	
	@Test
	void sumarUnidadesExtremas01() {
		assertEquals(Integer.MAX_VALUE, unaCalculadora.sumar(Integer.MAX_VALUE-1,1));
	}
	
	@Test
	void mostrarSumaUnidadesMinimas() {
		assertEquals("2", unaCalculadora.mostrarResultadoSuma(1,1));
	}
	
	@Test
	void mostrarSumaCeros() {
		assertEquals("Los ceros no son numeros naturales", unaCalculadora.mostrarResultadoSuma(0,0));
	}

}
