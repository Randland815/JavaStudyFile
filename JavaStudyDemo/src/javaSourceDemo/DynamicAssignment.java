package javaSourceDemo;

import java.util.Scanner;

public class DynamicAssignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		double sum = 0, avg;
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�������" + (i + 1) + "λͬѧ�ĳɼ���");
			// ���û������double�������֣���ֵ�������еĵ�i��Ԫ��
			scores[i] = input.nextDouble();
		}
		// �����ܳɼ�
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.printf("%dλͬѧ���ܷ��ǣ�%.2f\tƽ�����ǣ�%.2f", scores.length, sum, sum / scores.length);
	}
}