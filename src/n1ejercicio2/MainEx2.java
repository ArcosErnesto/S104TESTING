package n1ejercicio2;

public class MainEx2 {

	public static void main(String[] args) {
		int inputDNI;

		inputDNI = 41006244;

		char letraDNI = CalculoDni.calculateLetter(inputDNI);

		System.out.println("Al DNI " + inputDNI + " le corresponde la letra " + letraDNI);

	}
}
