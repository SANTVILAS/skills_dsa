package star_pattern;

public class Test4 {

	public static void main(String[] args) {
		/*****
		***
		**
		**/

		//need to run loop 5 times fo rthat
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
