package javaSourceDemo;

import java.util.Scanner;

public class ShoppingCartPro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, price1, price2, price3; // ��Ʒ����
		int count; // ������Ʒ������
		double total = 0; // �ܼ�
		// 1.����������Ʒ�ĵ��ۺ�����
		System.out.print("������MacBook Pro�ĵ���:");
		price1 = price = input.nextDouble();
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;
		System.out.print("������iPhoneXS MAX�ĵ���:");
		price2 = price = input.nextDouble();
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;
		System.out.print("������AirPods Pro�ĵ���:");
		price3 = price = input.nextDouble();
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;
		// 2.�ж��Ƿ����
		if ((price1 > 5000 && price2 > 5000 && price3 > 5000) || (total > 35000))
			total *= 0.3;
		else
			total *= 0.8;
		// 3.������ۺ�ļ۸�
		System.out.println("���ۺ�ļ۸�Ϊ��" + total);
	}
}