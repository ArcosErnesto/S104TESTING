package n1ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testCalculateLetter() {
		int[] numDNI = { 41006244, 12345678, 98765432, 54321678, 87654321, 11223344, 99887766, 55555555, 66666666,
				77777777 };
		char[] expetedLettersList = { 'G', 'Z', 'M', 'W', 'X', 'B', 'P', 'K', 'Q', 'B' };
		String letters = "TRWAGMYFPDXBNJZSQVHLCKE";

		for (int i = 0; i < numDNI.length; i++) {
			char returnLetter = Main.calculateLetter(numDNI[i], letters);
			char expetedLetter = expetedLettersList[i];
			assertEquals(expetedLetter, returnLetter, "El DNI " + numDNI[i] + " debería tener letra " + expetedLetter);
		}
	}
}