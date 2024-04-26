package challenges;

import java.util.Scanner;

public class arrowhead {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of arrowheads to print");
		int numberOfArrowhead = sc.nextInt();
		
		for (int i=1;i<=numberOfArrowhead; i++) {
			for(int j=1;j<i+1;j++) {
			System.out.print(">");
			}
			System.out.println();
		}
		for (int i=numberOfArrowhead;i>=1; i--) {
			for(int j=i-1;j>=1;j--) {
			System.out.print(">");
			}
			System.out.println();
		}
		
		

	}

}
