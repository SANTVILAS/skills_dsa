package star_pattern;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		/*
		*****
		***
		**
		*
		*/
      // I need to give order like how many star you want to print
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
	for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
}
