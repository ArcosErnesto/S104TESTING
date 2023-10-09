package n1ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<String>();

		months = createList();

		for (String monthName : months) {
			System.out.println(monthName);
		}

	}

	public static ArrayList<String> createList() {
		ArrayList<String> months = new ArrayList<String>();
		months.add("Enero");
		months.add("Febrero");
		months.add("Marzo");
		months.add("Abril");
		months.add("Mayo");
		months.add("Junio");
		months.add("Julio");
		months.add("Agosto");
		months.add("Septiembre");
		months.add("Octubre");
		months.add("Noviembre");
		months.add("Diciembre");

		return months;

	}

}
