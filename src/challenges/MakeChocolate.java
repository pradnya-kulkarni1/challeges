package challenges;

import java.util.Scanner;

public class MakeChocolate {

	public static void main(String[] args) {
		
		boolean find6;
		
		int values;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For(4 small,1 big ,9 goal) number of Small bars in use = "+makeChocolate(4,1,9));
		System.out.println("For(4 small,1 big ,10 goal) number of Small bars in use = "+makeChocolate(4,1,10));
		System.out.println("For(4 small,1 big ,7 goal) number of Small bars in use = "+makeChocolate(4,1,7));

		System.out.println("How many values in array? ");
		values = sc.nextInt();
		int numArray[]= new int[values];
		System.out.println("Enter values of array");
		for(int i=0; i< values; i++) {
			numArray[i]= sc.nextInt();
		}
			
		find6 = firstLast6(numArray);
		System.out.println("For first one : "+find6);
	}
	public static int makeChocolate(int small, int big, int goal) {
		int weCanMake = small+big*5;
		if(weCanMake == goal) { return small;}
		else return (weCanMake-goal);
		
		
	}
	public static boolean firstLast6(int[] nums) {
		boolean k = false;
		System.out.println("array length="+nums.length);
			if(nums[0]==6)  
				{
				k =true;
				}
			
			else k = false;
			
	
		 if(nums[nums.length-1] == 6)  k = true;
		return k;
	}

}
