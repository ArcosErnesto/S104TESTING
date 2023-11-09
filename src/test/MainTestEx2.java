package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import n1ejercicio2.CalculoDni;

class MainTestEx2 {

	static Stream<Arguments> provideDniNumbersAndExpectedLetters() {
		return Stream.of(Arguments.of(41006244, 'G'), Arguments.of(12345678, 'Z'), Arguments.of(98765432, 'M'),
				Arguments.of(54321678, 'W'), Arguments.of(87654321, 'X'), Arguments.of(11223344, 'B'),
				Arguments.of(99887766, 'P'), Arguments.of(55555555, 'K'), Arguments.of(66666666, 'Q'),
				Arguments.of(77777777, 'B'));
	}

	@ParameterizedTest
	@MethodSource("provideDniNumbersAndExpectedLetters")
	void testCalculateLetter(int numDNI, char expetedLetter) {
		char returnLetter = CalculoDni.calculateLetter(numDNI);
		assertEquals(expetedLetter, returnLetter, "El DNI " + numDNI + " debería tener letra " + expetedLetter);
	}
}