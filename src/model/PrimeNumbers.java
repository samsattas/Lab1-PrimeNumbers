package model;
import java.lang.Math;
import java.util.InputMismatchException; 


import java.util.InputMismatchException;

public class PrimeNumbers {

	public PrimeNumbers() {
		
	}
<<<<<<< HEAD
	
=======
>>>>>>> 66d0037bc5b332767998a477440c50943ab79f7b
	public int convertToInt(String n) {
		int toSend = 0;
		try {
			 toSend = Integer.parseInt(n);
		} catch(InputMismatchException e) {
			throw new InputMismatchException("Warning! Fail");
		}
		
		return toSend;
	}
<<<<<<< HEAD
	
	
	
	public boolean primeNumbersVerification1(int n){
=======
	public boolean primeNumbersVerification1(String s) throws InputMismatchException{
>>>>>>> 66d0037bc5b332767998a477440c50943ab79f7b
		boolean aux = true;
<<<<<<< HEAD
		int n = convertToInt(s);
=======
		if(n==1) {
			aux = false;
		}else {
>>>>>>> 5c19ecdaba548f353da5ef6e07c123e02e3ae555
			for(int i = 2; i < n && aux; i++) {
				if(n%i == 0) {
					aux = false;
				}
			}
<<<<<<< HEAD
	
=======
		}
		
>>>>>>> 5c19ecdaba548f353da5ef6e07c123e02e3ae555
		return aux;
	}
<<<<<<< HEAD
	
	
	
	public boolean primeNumbersVerification2(int n){
=======
	public boolean primeNumbersVerification2(String s){
>>>>>>> 66d0037bc5b332767998a477440c50943ab79f7b
		boolean aux = true;
		int n = convertToInt(s);
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
<<<<<<< HEAD
	
	
	
	public boolean primeNumbersVerification3(int n){
=======
	public boolean primeNumbersVerification3(String s){
>>>>>>> 66d0037bc5b332767998a477440c50943ab79f7b
		boolean aux = true;
<<<<<<< HEAD
		int n = convertToInt(s);
		for(int i = n - 1; i > 1 && aux; i--) {
			if(n%i == 0) {
				aux = false;
=======
		if(n==1) {
			aux = false;
		}else {
			for(int i = n - 1; i > 1 && aux; i--) {
				if(n%i == 0) {
					aux = false;
				}
>>>>>>> 5c19ecdaba548f353da5ef6e07c123e02e3ae555
			}
		}
		return aux;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
	public boolean Validation1Prime(String s) {
=======
<<<<<<< HEAD
>>>>>>> 66d0037bc5b332767998a477440c50943ab79f7b
	
	
	
	public boolean Validation1Prime(int numberToValidate) {
>>>>>>> 5c19ecdaba548f353da5ef6e07c123e02e3ae555
		int counter = 0;
		int n = convertToInt(s);
		boolean ok = false;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
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
