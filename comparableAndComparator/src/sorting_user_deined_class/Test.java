package sorting_user_deined_class;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {

	int eno;
	String ename;
	float esal;
	String eaddr;

	Employee(int eno, String ename, float esal, String eaddr) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}

	// implementation of toString method

	public String toString() {
		return "[" + eno + "," + ename + "," + esal + "," + eaddr + "]";
	}

	@Override
	public int compareTo(Employee str) {
      int val= this.ename.compareTo(this.ename);
		return val;
	}

}

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee(111, "AAA", 5000, "HYD");
		Employee e2 = new Employee(222, "BBB", 6000, "HYD");
		Employee e3 = new Employee(333, "CCC", 7000, "HYD");
		Employee e4 = new Employee(444, "DDD", 8000, "HYD");

		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e4);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);

		System.out.println(ts);

	}

}
