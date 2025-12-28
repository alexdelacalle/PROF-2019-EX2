package es.upm.grise.profundizacion2025;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ClaseExamenTest {

	@Test
	public void nIgualASeis() {
		List<Integer> nPrimos = new ArrayList<>();
		nPrimos.add(2);
		nPrimos.add(3);
		try {
	        List<Integer> resultado = ClaseExamen.primos(6);
			assertEquals(nPrimos,resultado);

		}catch(EntradaInvalida e) {
			e.getMessage();
		}
		

	}
	
	@Test
	public void nIgualATrece() {
		List<Integer> nPrimos = new ArrayList<>();
		nPrimos.add(13);
		
		try {
	        List<Integer> resultado = ClaseExamen.primos(13);
			assertEquals(nPrimos,resultado);

		}catch(EntradaInvalida e) {
			e.getMessage();
		}
		

	}
	
	@Test
	public void nIgualAQuince() {
		List<Integer> nPrimos = new ArrayList<>();
		nPrimos.add(3);
		nPrimos.add(5);
		
		try {
	        List<Integer> resultado = ClaseExamen.primos(15);
			assertEquals(nPrimos,resultado);

		}catch(EntradaInvalida e) {
			e.getMessage();
		}
		
	}
	
	@Test
	public void nIgualAVeinticinco() {
		List<Integer> nPrimos = new ArrayList<>();
		nPrimos.add(5);
		nPrimos.add(5);

		try {
	        List<Integer> resultado = ClaseExamen.primos(25);
			assertEquals(nPrimos,resultado);

		}catch(EntradaInvalida e) {
			e.getMessage();
		}
	}
	
	@Test
	public void entradaInvalida()  {
		
		
		assertThrows(EntradaInvalida.class, () -> {
	        ClaseExamen.primos(1);
	    });

	}
}
