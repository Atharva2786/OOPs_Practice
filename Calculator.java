package Cal;
import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {
		
		char operator;
		double num1 , num2 , result ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nChoose an operator: + , - , * , or / ");
		operator = input.next().charAt(0);
		
		System.out.println("\nEnter First Number: ");
		num1 = input.nextDouble();
		
		System.out.println("\nEnter Second Number: \n");
		num2 = input.nextDouble();
		
		switch (operator) {
		
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;	
			
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		
		case '/':
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            }
		
		default:
			System.out.println("Invalid Operator!");
			break;
		}
		
		input.close();
	
	}


}
