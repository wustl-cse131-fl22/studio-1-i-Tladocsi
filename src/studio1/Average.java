package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("the first of two integers to be averaged");
		int n1 = in.nextInt();
		System.out.println("the Second of two integers to be averaged");
		int n2 = in.nextInt();
		double mean = (n1+n2) / 2 ;
		System.out.println(mean);
	}

}
