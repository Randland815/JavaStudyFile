package javaSourceDemo;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.�õ�Ҫ�������������
		System.out.print("��������Ҫ��������֣�");
		int num = input.nextInt(); // ��Ҫ���������
		// 2.������ر���
		int sum = 0; // �ۼӺ�
		// 3.ѭ�������ۼ�
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		// 4.������
		System.out.println("��λ����֮��Ϊ��" + sum);
	}
}
