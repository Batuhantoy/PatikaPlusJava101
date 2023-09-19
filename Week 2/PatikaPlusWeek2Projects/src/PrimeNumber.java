import java.util.Scanner;

public class PrimeNumber {
	
	boolean isPrime(int number, int i) {
		if(number<=2) {
			return (number==2) ? true : false;
		}
		if(number%i==0) {
			return false;					
		}
		if(i*i > number) {
			return true;
		}
		return isPrime(number,i+1);
	}

	public PrimeNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayı Giriniz : ");
		int number = sc.nextInt();
		sc.close();
		
		if(isPrime(number,2)) {
			System.out.println(number+" sayısı ASALDIR !");
		}else {
			System.out.println(number+" sayısı ASAL değildir !");
		}
	}

}
