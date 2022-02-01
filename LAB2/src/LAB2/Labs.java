package LAB2;

import java.util.Scanner ;

public class Labs {
	static void findNum(int number) {
		System.out.print(" : Divide by ") ;
		for(int i = 2 ; i < number ; i++) {
			if(number%i == 0) {
				System.out.print(i + ", ") ;
			}
		}
				System.out.println("\b\b") ;
	}
	static void checkPrime(int number) {
		boolean prime ;
			for(int i = 2 ; i <= number ; i++) {
				prime = true ;
				System.out.print(i + " = ") ;
			for(int j = 2 ; j < i ; j++) {
				if(i%j == 0) {
				prime = false ;
				System.out.print("Not Prime") ;
				findNum(i) ;
				break ;
				}
			}
				if(prime) {
				System.out.println("Prime Number") ;
				}
			}
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in) ;
		System.out.print("Please enter your value : ") ;
		int number = userInput.nextInt() ; 
		System.out.println("-----------------------") ;
		checkPrime(number) ;
	}
}

