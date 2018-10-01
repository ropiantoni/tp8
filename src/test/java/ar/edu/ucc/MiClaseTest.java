package ar.edu.ucc;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiClaseTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		MiClase tester = new MiClase();
		tester.multiplicar(1000, 5);
	}

	@Test
	public void testMultiply() {
		MiClase tester = new MiClase();
		assertEquals("10 x 5 must be 50", 50, tester.multiplicar(10, 5));
	}
	}

