import java.util.Scanner;

public class PlaneTicket {

	public PlaneTicket() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		int mesafe = sc.nextInt();
		
		
		System.out.print("Yaşınızı giriniz : ");
		int yaş = sc.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		int tip = sc.nextInt();
		sc.close();
		
		if(mesafe>0 && yaş>0 && (tip==1 || tip==2)) {
			double tutar = mesafe * 0.10;
			if(yaş<12) {
				tutar = tutar - (tutar * 0.50);
			}
			if(yaş>=12 && yaş<24) {
				tutar = tutar - (tutar * 0.10);
			}
			if(yaş>65) {
				tutar = tutar - (tutar * 0.30);
			}
			if(tip==2) {
				tutar = (tutar - (tutar * 0.20))*2;
			}
			System.out.println("Toplam Tutar = "+tutar);		
			
			
		}else {
			System.out.println("Hatalı veri girdiniz!!");
		}
	}

}
