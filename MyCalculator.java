package day2assignment;

public class MyCalculator {

	public static void main(String[] args) {
	Calculator MyCal = new Calculator();
	MyCal.add();
	MyCal.sub();
	MyCal.div();
	MyCal.mul();
	
	int Vj= MyCal.add();
	System.out.println("Answer is " + Vj);
	int A= MyCal.sub();
	System.out.println("Answer is " + A);
	int B= MyCal.div();
	System.out.println("Answer is " + B);
	int C= MyCal.mul();
	System.out.println("Answer is " + C);
	


	}

}
