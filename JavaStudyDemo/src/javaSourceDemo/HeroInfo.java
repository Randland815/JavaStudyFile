package javaSourceDemo;

import java.util.Scanner;

public class HeroInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����ֵ���� �� �� �� �� �� �� �� �� ��");
		System.out.println("���������� �� �� �� �� �� �� �� �� ��");
		System.out.println("�����˺����� �� �� �� �� �� �� �� �� ��");
		System.out.print("�������˺���");
		double attack = input.nextDouble(); // �˺�
		System.out.print("�������˺��ɳ�ֵ��");
		double attackGrowth = input.nextDouble();
		System.out.printf("\n�˺���%.2f��+%.2f��\n", attack, attackGrowth);
	}
}