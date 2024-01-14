package double_equal_and_equals_comparison;

class A {

}

/*
 * object class equals method always do reference comparison and String class
 * String method meant for content comparison
 */

public class Test {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		A a1 = new A();
		A a2 = new A();

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

	}

}
