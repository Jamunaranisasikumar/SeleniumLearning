package week1.day2;

public class CheckPrimeNumer {
public static void main(String[] args) {
	int input =20;
	if (isPrime(input)) {
		System.out.println("the number is prime number");
	}else {
		System.out.println("The number is not prime number");
		
	}

}

private static boolean isPrime(int number) {
	
	if (number<=1) {
	return false;}
	for(int i=2; i<=number/2; i++) {
		if(number%i==0) {
			return false;
		}
	}
	return true;
}
}
