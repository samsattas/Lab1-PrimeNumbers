package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.PrimeNumbers;

class TestPrimeNumbers {

	public int setUpScenePrimeNumbers()    {
		int counter = 0;
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=100; i++) {
			if(prime.Validation1Prime(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	
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
	public ArrayList<Boolean> setUpSceneIsPrimeValidation1Prime() {
		ArrayList<Boolean> arrayWithBoolean = new ArrayList<>();
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=7; i+=2) {
			if(prime.Validation1Prime(i) == true) {
				boolean toadd = prime.Validation1Prime(i);
				arrayWithBoolean.add(toadd);
			}
		}
		return arrayWithBoolean;	
	}
	
	public ArrayList<Boolean> setUpSceneIsPrimeValidation3Prime() {
		ArrayList<Boolean> arrayWithBoolean = new ArrayList<>();
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=7; i+=2) {
			if(prime.primeNumbersVerification2(i) == true) {
				boolean toadd = prime.primeNumbersVerification2(i);
				arrayWithBoolean.add(toadd);
			}
		}
		return arrayWithBoolean;	
	}
	public ArrayList<Boolean> setUpSceneIsPrimeValidation4Prime() {
		ArrayList<Boolean> arrayWithBoolean = new ArrayList<>();
		PrimeNumbers prime = new PrimeNumbers();
		for(int i = 1; i<=7; i+=2) {
			if(prime.primeNumbersVerification3(i) == true) {
				boolean toadd = prime.primeNumbersVerification3(i);
				arrayWithBoolean.add(toadd);
			}
		}
		return arrayWithBoolean;	
	}
	public int setUpSceneConvertToInt() {
		PrimeNumbers prime = new PrimeNumbers();
		int toTest = prime.convertToInt("22");
		return toTest;
	}
	public int setUpSceneExceptioConvert() {
		PrimeNumbers prime = new PrimeNumbers();
		int toTest = prime.convertToInt("dd");
		return toTest;
	}
	@Test
	void test() {
		assertEquals(25, setUpScenePrimeNumbers());
	}
	
	@Test
	void testprimeNumbersVerification2() {
		assertEquals(26, setUpSceneprimeNumbersVerification2());
	}
	@Test
	void testprimeNumbersVerification3() {
		assertEquals(25, setUpSceneprimeNumbersVerification3());
	}
	@Test
	void testgenerateMatrix(){
		assertEquals(12, setUpScenegenerateMatrix());
	}
	@Test
	void testIsPrimeWithArrayList() {
		String info = setUpSceneIsPrimeValidation1Prime().toString();
		assertEquals("[true, true, true]", info);
	}
	
	@Test
	void testIsPrimeWithArrayListNbersVeri2() {
		String info = setUpSceneIsPrimeValidation3Prime().toString();
		assertEquals("[true, true, true, true]", info);
	}
	@Test
	void testIsPrimeWithArrayListNbersVeri3() {
		String info = setUpSceneIsPrimeValidation4Prime().toString();
		assertEquals("[true, true, true]", info);
	}
	@Test
	void testCovertToInt() {
		assertEquals(22, setUpSceneConvertToInt());
	}
	@Test
	void testExceptionConvertToInt() {
		try {
			setUpSceneExceptioConvert();
		} catch (NumberFormatException e) {
			fail();
		}
	}
}
