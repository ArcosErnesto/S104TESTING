package n1ejercicio3;

public class Main {

	public static void main(String[] args) {
		int index = 5;

		try {
			getException(index);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se produjo una excepción por índice de matriz fuera de límites.");
		}
	}

	public static void getException(int index) throws ArrayIndexOutOfBoundsException {
		int[] list = { 1, 2, 3, 4, 5 };

		if (index < 0 || index >= list.length) {
			throw new ArrayIndexOutOfBoundsException("El índice está fuera de límites.");
		}

		System.out.println(list[index]);
	}
}
