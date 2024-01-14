package increment_decrement;

public class Increment {
 
	public static void main(String[] args) {
		int a=10;
		//System.out.println(++a);
		System.out.println(a++);
		a++;
		++a;
		System.out.println(a);
		
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		a=4;
		a*=2;
		System.out.println(a);
		
		
		a^=2;
		System.out.println(a);
		
		int ans1=2+3*2;
		System.out.println(ans1);
		
		int ans2=(2*3)/2;
		System.out.println(ans2);
	}
}
