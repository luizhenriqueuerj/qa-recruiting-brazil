package qa2.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qa2.Kota09;

class Kota09Teste {
	Kota09 kotateste;
	
	@BeforeEach
	public void setUp() {
		kotateste = new Kota09();
	}
	

	@Test
	void testA() {
		assertEquals(50,kotateste.CheckoutKata("A"));
	}

	@Test
	void testAB() {
		assertEquals(80,kotateste.CheckoutKata("AB"));
	}
	
	@Test
	void testCDBA() {
		assertEquals(115,kotateste.CheckoutKata("CDBA"));
	}
	
	@Test
	void testAA() {
		assertEquals(100,kotateste.CheckoutKata("AA"));
	}
	
	@Test
	void testAAA() {
		assertEquals(130,kotateste.CheckoutKata("AAA"));
	}
	
	void testAAAA() {
		assertEquals(180,kotateste.CheckoutKata("AAA"));
	}
	
	void testAAAAA() {
		assertEquals(230,kotateste.CheckoutKata("AAAAA"));
	}
	
	void testAAAAAA() {
		assertEquals(230,kotateste.CheckoutKata("AAAAAA"));
	}
	
	void testAAAB() {
		assertEquals(160,kotateste.CheckoutKata("AAAB"));
	}
	
	void testAAABBD() {
		assertEquals(190,kotateste.CheckoutKata("AAABBD"));
	}
	
	void testDABABA() {
		assertEquals(190,kotateste.CheckoutKata("DABABA"));
	}

}
