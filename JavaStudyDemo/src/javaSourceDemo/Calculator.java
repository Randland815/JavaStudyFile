package javaSourceDemo;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, result = 0;
		String operator = "";
		String choice = "";
		do {
			System.out.print("请输入需要计算的两个数：");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.print("请输入运算符：");
			operator = input.next();
			switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;

			}
			System.out.print("是否继续(y/n)：");
			choice = input.next();
		} while (choice.equalsIgnoreCase("n"));
		System.out.printf("%.2f %s %.2f = %.2f", num1, operator, num2, result);
	}
}
