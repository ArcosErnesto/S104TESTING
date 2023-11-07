package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import n1ejercicio3.MainEx3;

public class MainTestEx3 {

	@Test
	public void testArrayIndexOutOfBoundsException() {
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			MainEx3 main = new MainEx3();
			main.getElementAtIndex(arr, 10);
			fail("Se esperaba una ArrayIndexOutOfBoundsException");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("Índice fuera de los límites del array", e.getMessage());
		}
	}
}
