package javaSourceDemo;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������̷���");
		char ch = input.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("�̷��Ϸ�");
		} else {
			System.out.println("�̷��Ƿ�");
		}
	}
}