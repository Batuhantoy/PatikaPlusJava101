import java.util.Scanner;

public class ChineseZodyak {
	
	String Zodyak(int result) {
		switch(result) {
		case 0:
			return "Maymun";
		case 1:
			return "Horoz";			
		case 2:
			return "Köpek";			
		case 3:
			return "Domuz";
		case 4:
			return "Fare";
		case 5:
			return "Öküz";
		case 6:
			return "Kaplan";
		case 7:
			return "Tavşan";
		case 8:
			return "Ejderha";
		case 9:
			return "Yılan";
		case 10:
			return "At";
		case 11:
			return "Koyun";
			
		}
		return null;
	}

	public ChineseZodyak() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Doğum Yılınızı Giriniz : ");
		int date = sc.nextInt();
		sc.close();
		int result = date % 12;
		String sonuç = (Zodyak(result)!=null) ? ("Çin Zodyağı Burcunuz : "+ Zodyak(result)) : "Bir sorun oluştu";
		System.out.println(sonuç);
	}

}
