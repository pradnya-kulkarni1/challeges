package challenges;

import java.util.Scanner;

public class rotateArrayLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How may values in the Array?");
		int k = sc.nextInt();
		int firstArray[]= new int[k];
		System.out.println("Enter "+k+"values");
		for(int i=0; i<k; i++) {
			firstArray[i]= sc.nextInt();
		}
		System.out.println("Sending array to the method");
		int secondArray[] = new int[k];
		secondArray = rotateLeft(firstArray);
		System.out.println("Rotated values are");
		for(int j=0;j<k;j++) {
			System.out.print(secondArray[j]+" ");
			
		}
		
		
	}

	public static int[] rotateLeft(int[] nums) {
		int resultArray[]= new int[nums.length];
		int last = nums[0];
		
			for(int j=1; j<nums.length;j++) {
				resultArray[j-1]=nums[j];
				
			}
			resultArray[nums.length-1]=last;
	
		return resultArray;
	}
}
