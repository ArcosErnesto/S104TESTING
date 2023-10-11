package n1ejercicio3;

import static org.junit.Assert.fail;

import org.junit.Test;

public class MainTest {

	@Test
	public void testGetExceptionWithValidIndex() {
		int validIndex = 2;
		try {
			Main.getException(validIndex);
		} catch (ArrayIndexOutOfBoundsException e) {
			fail("No se esperaba una excepción en este caso.");
		}
	}

	@Test
	public void testGetExceptionWithInvalidIndex() {
		int invalidIndex = 5;
		try {
			Main.getException(invalidIndex);
			fail("Se esperaba una excepción de índice de matriz fuera de límites.");
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}
}
