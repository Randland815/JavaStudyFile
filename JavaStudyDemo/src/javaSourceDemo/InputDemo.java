package javaSourceDemo;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		System.out.print("请输入圆的半径：");
		Scanner input = new Scanner(System.in);
		//
		double radius = input.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.printf("圆的面积为：%.2f\n", area);
	}
}
