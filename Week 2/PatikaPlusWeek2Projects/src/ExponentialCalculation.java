import java.util.Scanner;

public class ExponentialCalculation {

	int Exponent(int base, int exponent) {		
		if(exponent==1) {
			return base;
		}
		if(exponent==0) {
			return 1;
		}
		return base*Exponent(base,exponent-1);
		
	}
	
	public ExponentialCalculation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Taban değeri giriniz : ");
		int base = sc.nextInt();
		
		System.out.print("Üs değeri giriniz : ");
		int exponent = sc.nextInt();
		sc.close();
		
		System.out.println("Sonuç : "+Exponent(base,exponent));
	}

}
