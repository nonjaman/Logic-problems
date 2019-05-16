package pirate_speak;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPirate {
	
	//Decalre the list here to help with typing speed
	private String[] wordlist = new String[10];

	@Test
	public void testPirate() {
		//Initialize the test list
		this.wordlist[0] = "Ball";
		this.wordlist[1] = "Whale";
		this.wordlist[2] = "Pirate";
		this.wordlist[3] = "words";
		this.wordlist[4] = "sport";
		this.wordlist[5] = "parrot";
		this.wordlist[6] = "ports";
		this.wordlist[7] = "matey";
		this.wordlist[8] = "gorges";
		this.wordlist[9] = "seggor";
		
		String[] solutionList = new String[2];
		solutionList[0] = this.wordlist[4];
		solutionList[1] = this.wordlist[6];
		
		String[] solution1 = Pirate.pirate("ortsp", this.wordlist);
		assertEquals(solutionList[1], solution1[1]);
		assertEquals(solutionList[0], solution1[0]);
		
		
		String[] solution2 = Pirate.pirate("llab", this.wordlist);
		assertEquals(this.wordlist[0], solution2[0]);
		
		String[] solution3 = Pirate.pirate("WLAhe", this.wordlist);
		assertEquals(this.wordlist[1], solution3[0]);
		
	}
	
	@Test
	public void testAlphaSort() {
		assertEquals("abcde", Pirate.alphaSort("bacde"));
		assertNotEquals("acegtiy", Pirate.alphaSort("gecatiyq"));
		assertEquals("aabbccdd", Pirate.alphaSort("abcdabcd"));
		assertEquals("abcde", Pirate.alphaSort("edcba"));
	}

}
