package javaSourceDemo;

import java.util.Scanner;

public class MoneyExchanging {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������");
		double money = input.nextDouble();
		// ������������
		int yuan = (int) money;
		int numOfTens = yuan / 10; // ʮԪֽ�ҵ�����
		int numOfFives = yuan % 10 / 5; // ��Ԫֽ�ҵ�����
		int numOfOnes = yuan % 10 - 5; // һԪֽ������
		// ����С������
		int dime = ((int) (money * 10)) % 10;
		int numOfFiftyCents = dime / 5; // ��ǵ�����
		int numOfTenCents = dime - 5; // һ��ֽ�ҵ�����
		System.out.printf("10Ԫֽ�ҵ�������%d\n", numOfTens);
		System.out.printf("5Ԫֽ�ҵ�������%d\n", numOfFives);
		System.out.printf("1Ԫֽ�ҵ�������%d\n", numOfOnes);
	}
}
