package sorting_user_defined_nonComparable_object;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer str1, StringBuffer str2) {
		int lenght1 = str1.length();
		int lenght2 = str2.length();
		int val = 0;
		if (lenght1 < lenght2) {
			val = -100;
		} else if (lenght1 > lenght2) {
			val = 100;
		} else {
			val = 0;
		}
		return val;
	}

}

public class Test {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("B");
		StringBuffer sb3 = new StringBuffer("CCCCC");
		StringBuffer sb4 = new StringBuffer("DD");
		StringBuffer sb5 = new StringBuffer("EEEE");

		MyComparator mc = new MyComparator();
		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(mc);
         ts.add(sb1);
         ts.add(sb2);
         ts.add(sb3);
         ts.add(sb4);
         ts.add(sb5);
         System.out.println(ts);
	}

}
