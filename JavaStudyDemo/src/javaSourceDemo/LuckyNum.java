package javaSourceDemo;

import java.util.Scanner;

public class LuckyNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int price = 12000;
		int guessPrice = 0, count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("�²¶���Ǯ����" + ++count + "�Σ�");
			guessPrice = input.nextInt();
			if (guessPrice == price) {
				if (count == 1) {
					System.out.println("��ϲ��ü�ֵ40���Mac Pro");
					System.exit(0);
				} else if (count >= 2 && count <= 3) {
					System.out.println("��ϲ��ü�ֵ12000��iPhone 11 Pro Max");
					System.exit(0);
				} else if (count >= 4 && count <= 5) {
					System.out.println("��ϲ��ü�ֵ999999999999Խ�϶ܵ�Jvav������");
					System.exit(0);
				}
			} else if (5 - count > 0) {
				System.out.println("�²�����������ʣ��" + (5 - count) + "�λ��ᣩ");
			} else {
				System.out.println("ûһ�β¶ԣ���ο��������ϰ�ͬ�������");
			}
		}
	}
}
