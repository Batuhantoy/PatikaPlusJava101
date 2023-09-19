import java.util.Scanner;

public class GroceryCashierProgram {

	public GroceryCashierProgram() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo ? : ");
		int armut = sc.nextInt();
		
		System.out.print("Elma Kaç Kilo ? : ");
		int elma = sc.nextInt();
		
		System.out.print("Domates Kaç Kilo ? : ");
		int domates = sc.nextInt();
		
		System.out.print("Muz Kaç Kilo ? : ");
		int muz = sc.nextInt();
		
		System.out.print("Patlıcan Kaç Kilo ? : ");
		int patlıcan = sc.nextInt();
		sc.close();
		double toplamTutar = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlıcan*5;
		System.out.println("Toplam Tutar : "+toplamTutar+" TL");
	}

}
