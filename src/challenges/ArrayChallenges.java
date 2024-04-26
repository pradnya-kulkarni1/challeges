package challenges;

public class ArrayChallenges {

	public static void main(String[] args) {
	
		
		int numbers[] = new int[] {10,15,3,7};
		int k = 17;
		int sum = 0;
		for(int i=0; i<numbers.length;i++) {
			for (int j=1;j<numbers.length;j++)
			{
				sum = numbers[i];
			sum += numbers[j];
			if (sum == k) {
				System.out.print("Sum equals K for i and j"+i+" "+j);}
			sum = 0;
			}
		}
	}
		

	}


