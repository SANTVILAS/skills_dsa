package break_continue;

import java.util.Scanner;

public class Break_Demo {

	// jo khud se aur 1 se devide ho bass thta is prime number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// let suppose no is 15 , which is not prime

		boolean divide=false;
		int d = 2;
		while (d <= N) {
			if (N % d == 0) {
				divide=true;
				break;
			}
			d=d+1;
		}
		if(divide) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
	}
}
