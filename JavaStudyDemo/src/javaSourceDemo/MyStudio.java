package javaSourceDemo;

import java.util.Scanner;

public class MyStudio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y", name = "";
		// 1.��ӡ�˵�
		do {
			System.out.print("\n�٣������ģ�������������֣�");
			name = input.nextLine();
			System.out.print("\n�������������(y/n)��");
			answer = input.nextLine();
		} while (answer.equalsIgnoreCase("n"));
		// 2.������
		System.out.println("\n" + name + " ��ӭ���� MaftertStudio");
	}
}
