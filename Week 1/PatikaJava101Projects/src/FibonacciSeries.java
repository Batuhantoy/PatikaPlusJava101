import java.util.Scanner;

public class FibonacciSeries {
	
	int Fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public FibonacciSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(Fibonacci(n));
	}

}
