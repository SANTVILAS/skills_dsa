package hasSet_selenium_express;

import java.util.HashSet;

public class Test1 {
 
	public static void main(String[] args) {
		
		HashSet<Integer> integerSet=new HashSet<Integer>();
		
		/*
		 * integerSet.add(10); integerSet.add(20); integerSet.add(30);
		 * integerSet.add(40); integerSet.add(50);
		 */
		System.out.println(integerSet.add(10));
		System.out.println(integerSet.add(20));
		System.out.println(integerSet.add(30));
		System.out.println(integerSet.add(40));
		System.out.println(integerSet.add(50));
		System.out.println(integerSet.add(50));
		
		System.out.println(integerSet);
	}
}
