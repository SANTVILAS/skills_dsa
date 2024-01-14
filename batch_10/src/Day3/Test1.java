package Day3;

public class Test1 {

	public static void main(String[] args) {
		int n=4;
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
                j++;
				if(j>i) {
					break;
				}
			}
			System.out.println();
			i++;
		}
	}
	
}
