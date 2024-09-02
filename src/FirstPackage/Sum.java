package FirstPackage;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of values to sum: ");
		int noOfValues = scan.nextInt();
		double tmpValue = 0;
		
		for(int i=1; i<=noOfValues; i++) {
			System.out.print("Enter value "+i +" : ");
			double myNum = scan.nextDouble();
			tmpValue =+ myNum;
		}
		System.out.print("Sum is "+tmpValue);
		scan.close();
	}

}
