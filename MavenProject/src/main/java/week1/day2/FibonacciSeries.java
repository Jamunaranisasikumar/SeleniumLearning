package week1.day2;

public class FibonacciSeries {
	public static void main (String[] args) {
		int limit = 8;
		int first = 0 ;
		int second = 1;
		
		for (int i=0; i<= limit; i++) {
			System.out.print(first + ",");
			int next = first + second ;
			first = second;
			second = next;
		}
	}

}
