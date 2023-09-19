import java.util.Scanner;

public class InvertedTriangle {

	public InvertedTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Basamak Sayısı : ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=num; i>=1 ; i--) {
			System.out.println("*".repeat(2*i-1));
			System.out.print(" ".repeat((num-i)+1));
		}
		System.out.println();
		for(int i=1;i<=num;i++) {
			System.out.print(" ".repeat(num-i));
			System.out.println("*".repeat((2*i)-1));
		}
	}

}
