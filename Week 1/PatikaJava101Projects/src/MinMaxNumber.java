import java.util.Scanner;

public class MinMaxNumber {
	
	public int min(int minNumber, int num) {
		return (num<minNumber) ? num : minNumber;
	}
	public int max(int maxNumber, int num) {
		return (num>maxNumber) ? num : maxNumber;
	}
	
	void MinMax(int[] nums) {
		int max=nums[0];
		int min=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
			else if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("En büyük sayı: "+max);
		System.out.println("En küçük sayı: "+min);
	}

	public MinMaxNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int N = sc.nextInt();
		
		int[] nums = new int[N];		
		for(int i =1;i<=N;i++) {
			System.out.print(i+". Sayıyı giriniz: ");
			nums[i-1]=sc.nextInt();
		}
		sc.close();
		int max=nums[0];
		int min=nums[0];
		
		for(int i=1;i<nums.length;i++) {
			max=max(max,nums[i]);
			min=min(min,nums[i]);
		}
		//MinMax(nums);
		System.out.println("En büyük sayı: "+max);
		System.out.println("En küçük sayı: "+min);
	}

}
