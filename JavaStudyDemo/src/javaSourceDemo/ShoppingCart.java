package javaSourceDemo;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price; // ��Ʒ����
		int count; // ������Ʒ������
		double total = 0; // �ܼ�
		// 1.����������Ʒ�ĵ��ۺ�����
		System.out.print("������MacBook Pro�ĵ���:");
		price = input.nextDouble();
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;
		System.out.print("������iPhoneXS MAX�ĵ���:");
		price = input.nextDouble();
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;
		System.out.print("������AirPods Pro�ĵ���:");
		price = input.nextDouble();
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;
		// 2.�ж��Ƿ����
		if (total >= 50000)
			total *= 0.7;
		else
			total *= 0.9;
		// 3.������ۺ�ļ۸�
		System.out.println("���ۺ�ļ۸�Ϊ��" + total);
	}
}
