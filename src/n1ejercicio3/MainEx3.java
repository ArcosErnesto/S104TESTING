package n1ejercicio3;

public class MainEx3 {

	public int getElementAtIndex(int[] arr, int index) {

		if (index < 0 || index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("Índice fuera de los límites del array");
		}
		return arr[index];
	}

}
