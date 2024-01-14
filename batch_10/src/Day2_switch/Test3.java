package Day2_switch;

class Test {
	public static void main(String[] args) {
		char c = 'B';
		switch (c) {
		case 'A':
			System.out.println("Five");
			break;
		case 'B':
			System.out.println("Ten");
			break;
		case 'C':
			System.out.println("Fifteen");
			break;
		case 'D':
			System.out.println("Twenty");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
}