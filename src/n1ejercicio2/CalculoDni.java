package n1ejercicio2;

public class CalculoDni {

	public static char calculateLetter(int numDNI) {
		String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
		int index = numDNI % 23;
		return letters.charAt(index);
	}

}
