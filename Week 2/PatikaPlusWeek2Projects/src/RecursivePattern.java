import java.util.Scanner;

public class RecursivePattern {
	
	boolean flag=true;
	int firstNumber;
	String pattern(int n, int i) {
		System.out.print(n+" ");
		n =n+i;
		if(n==firstNumber) {
			return Integer.toString(firstNumber);
		}else if(n<=0) {
			flag = false;
		}
		
		return flag ? pattern(n,-5) : pattern(n,5);
		
	}

	public RecursivePattern() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N sayısı : ");
		int number = sc.nextInt();
		sc.close();
		firstNumber=number;
		System.out.println(pattern(number,-5));
	}

}
