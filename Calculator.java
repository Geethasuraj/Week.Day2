package week1.day2assignment;
//Create a class "Calculator" with below methods
public class Calculator {
	//add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	public int add(int num1, int num2, int num3) {
		int sum= num1+ num2 + num3;
		System.out.println("The added number is :" + sum);
		return sum;
		}
	//sub(int num1, int num2), it should return subtraction of of num1-num2
	public int sub(int num1, int num2) {
		int sub =num1 - num2;
		System.out.println("The subtracted number is:" + sub);
		return sub;
	}
	//mul(double num1, double num2), it should return product of num1 * num2
	public double mul(double num1, double num2) {
		double mul = num1 * num2;
		System.out.println("The multiplied number is:" + mul);
		return mul;
	}
	//divide(float num1, float num2), it should return division of num1 / num2
	public float divide(float num1, float num2) {
		float divide = num1 / num2;		
		System.out.println("The divided number is:" + divide);
		return divide;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calobj = new Calculator();
		calobj.add(1,2,3);
		calobj.sub(7,5);
		calobj.mul(1.1, 3.5);
		calobj.divide(7.8f,9.8f);
		
	}

}
