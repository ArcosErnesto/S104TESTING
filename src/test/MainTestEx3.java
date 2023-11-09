package test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import n1ejercicio3.MainEx3;

public class MainTestEx3 {

	@Test
	public void testArrayIndexOutOfBoundsException() {
		int[] arr = { 1, 2, 3, 4, 5 };
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			MainEx3.getElementAtIndex(arr, 10);
		});
	}
}
