import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProcessPriority {
	
	public double process(ArrayList<String> list) {
		
		double result=0;
		//Console'a girilen stringde bölme işlemi varsa, o işlemin solundaki ve sağındaki stringleri
		//double'a çevirip aralarında bölme işlemi yapıyor
		if(list.contains("/")) {
			int index = list.indexOf("/");
			result =Double.parseDouble(list.get(index-1)) / Double.parseDouble(list.get(index+1));			
			list.set(index, Double.toString(result));
			list.remove(index+1);
			list.remove(index-1);
		}
		if(list.contains("*")) {
			int index = list.indexOf("*");
			result = Double.parseDouble(list.get(index-1)) * Double.parseDouble(list.get(index+1));
			list.set(index, Double.toString(result));
			list.remove(index+1);
			list.remove(index-1);
		}
		if(list.contains("-")) {
			int index = list.indexOf("-");
			result = Double.parseDouble(list.get(index-1)) - Double.parseDouble(list.get(index+1));
			list.set(index, Double.toString(result));
			list.remove(index+1);
			list.remove(index-1);
		}
		if(list.contains("+")) {
			int index = list.indexOf("+");
			result =Double.valueOf(list.get(index-1)) + Double.valueOf(list.get(index+1));
			list.set(index, Double.toString(result));
			list.remove(index+1);
			list.remove(index-1);
		}
		return result;
	}

	public ProcessPriority() {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("1.Sayı : ");
		int a = sc.nextInt();
		System.out.print("2.Sayı : ");
		int b = sc.nextInt();
		System.out.print("3.Sayı : ");
		int c = sc.nextInt();
		sc.close();
		
		int result = a+b*c-b;
		System.out.println(result);*/
		
		
		String string = sc.nextLine();
		sc.close();
		
		String[] chars= string.split("(?<=[-+*/])|(?=[-+*/])");
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(chars));
		
		for(String c:list) {
			System.out.print(c+",");
		}
		//Örnek olarak console a "64/4-9*3+5" girelim
		System.out.println();
		System.out.println("------------------------");
		System.out.println("Sonuç : "+process(list));
		//Sonuç : -6.0
		
	}

}
