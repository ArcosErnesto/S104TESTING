package n1ejercicio2;

public class Main {

	public static void main(String[] args) {
		int inputDNI;
		String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letter;

		inputDNI = 12345678;

		letter = calculateLetter(inputDNI, letters);

		System.out.println("Al DNI " + inputDNI + " le corresponde la letra " + letter);

	}

	public static char calculateLetter(int inputDNI, String letters) {
		int index = inputDNI % 23;
		return letters.charAt(index);
	}

}
