import java.util.Scanner;

public class TypeCasting {

	public TypeCasting() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tam sayı giriniz :");
		int integer = sc.nextInt();
		System.out.print("Ondalıklı sayı giriniz :");
		double d = sc.nextDouble();
		sc.close();
		
		double newDouble = integer;
		int newInt = (int)d;
		
		System.out.println("int to double :"+newDouble);
		System.out.println("double to int :"+newInt);
	}

}
