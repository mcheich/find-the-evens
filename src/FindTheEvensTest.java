import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheEvensTest {

	@Test
	void findEvensTest() {
		assertEquals("2 4 6 ", FindTheEvens.findEvens(6));
	}
	
	
	@Test
	void getPositiveInputTest() {
		assertTrue(FindTheEvens.getInput() >= 0);
	}
	
	@Test
	void countEvensTest() {
		assertEquals(1,FindTheEvens.countEvens(2));
	}
	
}
