package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.PrimeNumbers;

class TestPrimeNumbers {

	public int setUpScenePrimeNumbers() {
		//boolean ok = false;
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=100; i++) {
			if(prime.Validation1Prime(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	@Test
	void test() {
		setUpScenePrimeNumbers();
		assertEquals(25, setUpScenePrimeNumbers());
		
	}

}
