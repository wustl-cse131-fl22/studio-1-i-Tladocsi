package studio1;

import java.util.Scanner;

public class LeapYear_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The year in question");
		int yr = in.nextInt();
		boolean leap = ((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0));
		System.out.print(leap);
		
		
	}

}
