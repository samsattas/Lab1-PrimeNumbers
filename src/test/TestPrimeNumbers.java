package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.PrimeNumbers;

class TestPrimeNumbers {

	public int setUpScenePrimeNumbers()    {
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=100; i++) {
			//String converted = String.valueOf(i);
			if(prime.Validation1Prime(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	public int setUpSceneprimeNumbersVerification1() {
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=100; i++) {
			//String converted = String.valueOf(i);
			if(prime.primeNumbersVerification1(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	/*
	public void setUpSceneprimeNumbersVerification1Exception() {
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		prime.primeNumbersVerification1("Jeison top monitor");
		
	}
	*/
	public int setUpSceneprimeNumbersVerification2() {
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=100; i++) {
			//String converted = String.valueOf(i);
			if(prime.primeNumbersVerification2(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	public int setUpSceneprimeNumbersVerification3() {
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=100; i++) {
			//String converted = String.valueOf(i);
			if(prime.primeNumbersVerification3(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	public int setUpScenegenerateMatrix() {
		PrimeNumbers prime = new PrimeNumbers();
		return prime.generateMatrix(133);
	}
	@Test
	void test() {
		//setUpScenePrimeNumbers();
		assertEquals(25, setUpScenePrimeNumbers());
	}
	@Test
	void testprimeNumbersVerification1() {
		//setUpSceneprimeNumbersVerification1();
		assertEquals(25, setUpSceneprimeNumbersVerification1());
	}
	@Test
	void testprimeNumbersVerification2() {
		//setUpSceneprimeNumbersVerification2();
		assertEquals(25, setUpSceneprimeNumbersVerification2());
	}
	@Test
	void testprimeNumbersVerification3() {
		//setUpSceneprimeNumbersVerification3();
		assertEquals(25, setUpSceneprimeNumbersVerification3());
	}
	@Test
	void testgenerateMatrix(){
		//setUpScenegenerateMatrix();
		assertEquals(12, setUpScenegenerateMatrix());
	}
	
	
}
