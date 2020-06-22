package aaa;

public class WrapperDemo {

	public static void main(String[] args) {

		String s[] = {"10","60"};
		System.out.println("sum before: " + s[0] + s[1]);
		
		int x = Integer.parseInt(s[0]);
		Integer y = Integer.parseInt(s[1]);
		
		int z = x+y;
		
		System.out.println("Sum After: " + z);
		
	}

}