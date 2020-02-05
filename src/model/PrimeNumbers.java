package model;

public class PrimeNumbers {

	public PrimeNumbers() {
		
	}
	public boolean primeNumbersVerification1(int n){
		boolean aux = true;
		for(int i = 2; i < n && aux; i++) {
			if(n%i == 0) {
				aux = false;
			}
		}
		return aux;
	}
	public boolean primeNumbersVerification2(int n){
		boolean aux = true;
		
		if(n%2 == 0) {
			aux = false;
		}else {
			for(int i = 3; i < n && aux; i+=2) {
				if(n%i == 0) {
					aux = false;
				}
			}
		}	
		return aux;
	}
	public boolean primeNumbersVerification3(int n){
		boolean aux = true;
		for(int i = n - 1; i > 1 && aux; i--) {
			if(n%i == 0) {
				aux = false;
			}
		}
		return aux;
	}
	public boolean Validation1Prime(int numberToValidate) {
		int counter = 0;
		boolean ok = false;
		for(int i = 2; i <= numberToValidate; i++) {
			if(numberToValidate % i == 0) {
				counter++;
			}
		}
		if(counter == 1) {
			ok = true;
		}
		return ok;
	}
	public int generateMatrix(int n) {
        int aux = (int) Math.sqrt(n) + 1;
        return aux;
    }

}
