package Day2_switch;

public class Test2 {
	
	public static void main(String[] args) {
	//	int i=10;
	//	byte b = 10;
	//	short s=10;
		long l=10;
	//	double d=10
		switch (l) {//it is possible to pass byte here
		case 5l:
			System.out.println("Five");
			break;
		case 10l:
			System.out.println("Ten");
			break;
		case 15l:
			System.out.println("Fifteen");
			break;
		case 20l:
			System.out.println("Twenty");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}























//1.switch is able to allow the data types like byte, short, int and char.  char is lower than integer
