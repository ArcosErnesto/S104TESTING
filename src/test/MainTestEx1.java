package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import n1ejercicio1.MainEx1;

class MainTestEx1 {

	private static ArrayList<String> months;

	@BeforeAll
	public static void setUp() {
		months = MainEx1.createList();
	}

	@AfterAll
	public static void tearDown() {
		months = null;
	}

	@Test
	public void testHasTwelve() {
		assertEquals(12, months.size());
	}

	@Test
	public void testNotNull() {
		assertNotNull(months);
	}

	@Test
	public void testEighthAugust() {
		String expected = "Agosto";
		assertEquals(expected, months.get(7));
	}

}
