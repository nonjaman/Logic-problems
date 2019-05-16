package josephus_problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJosephus {

	
	//Tests the lastPersonStanding method
	@Test
	public void testLastPersonStanding() {
		assertEquals(3, Josephus.lastPersonStanding(5, 2));
		assertEquals(1, Josephus.lastPersonStanding(6, 5));
		assertEquals(5, Josephus.lastPersonStanding(6, 4));
		assertEquals(4, Josephus.lastPersonStanding(10, 3));
		assertNotEquals(4, Josephus.lastPersonStanding(10, 2));
		assertNotEquals(6, Josephus.lastPersonStanding(6, 5));
		assertEquals(5, Josephus.lastPersonStanding(6, 7));
	}

}
