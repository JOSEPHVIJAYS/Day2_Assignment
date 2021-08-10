package day2assignment;

public class Calculator {

	public int add() {
		int a = 1, b = 15;
		int c = a + b;
		return c;

	}

	public int sub() {
		int x = 20, y = 10;
		int z = x - y;
		return z;

	}

	public int div() {
		int j=4,v=10;
		int vj = j/v;
		return vj;
		
	}
	public int mul() {
		int a=4, b=27;
		int c= a*b;
		return c;	
	}

	public static void main(String[] args) {
	Calculator obj = new Calculator();
	int a = obj.add();
	System.out.println("Answer for c  is " + a);
	int b = obj.sub();
	System.out.println("Answer for z  is " + b);
	int c = obj.div();
	System.out.println("Answer for vj is " + c);
	int d = obj.mul();
	System.out.println("Answer for c  is " + d);
	} 

}
