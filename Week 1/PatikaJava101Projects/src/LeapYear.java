import java.util.Scanner;

public class LeapYear {

	public LeapYear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Yıl Giriniz : ");
		int date = sc.nextInt();
		sc.close();
		
		if(date%4==0 && date%100!=0) {
			System.out.println(date+" bir artık yıldır !");
		}
		else if(date%100==0 && date%400==0) {
			System.out.println(date+" bir artık yıldır !");
		}
		else {
			System.out.println(date+" bir artık yıldır değildir !");
		}
	}

}
