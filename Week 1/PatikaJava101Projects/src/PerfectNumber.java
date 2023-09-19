import java.util.Scanner;

public class PerfectNumber {

	public PerfectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int num = sc.nextInt();
		sc.close();
		
		int sum=0;
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		
		if(sum==num) {
			System.out.println(num+" Mükemmel sayıdır.");
		}else {
			System.out.println(num+" Mükemmel sayı değildir.");
		}
	}

}
