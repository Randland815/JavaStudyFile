package javaSourceDemo;

import java.util.Scanner;

public class MoneyTotal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0; // �����ĳ�ֵһ��Ϊ0
		double money = Double.MAX_VALUE; // ��һ�������ܵ�ֵ�����������ж�
		for (int i = 0; i < 5; i++) {
			System.out.print("�������" + (i + 1) + "λ��ҵ����ѽ�");
			money = input.nextDouble();
			if (money < 500) {
				count++;
			}
		}
		System.out.println("�����ܽ��С��500���������Ϊ��" + count);
	}
}
