package javaSourceDemo;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		System.out.print("������Բ�İ뾶��");
		Scanner input = new Scanner(System.in);
		//
		double radius = input.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.printf("Բ�����Ϊ��%.2f\n", area);
	}
}
