package javaSourceDemo;

import java.util.Scanner;

public class DynamicAssignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		double sum = 0, avg;
		for (int i = 0; i < scores.length; i++) {
			System.out.print("请输入第" + (i + 1) + "位同学的成绩：");
			// 将用户输入的double类型数字，赋值给数组中的第i个元素
			scores[i] = input.nextDouble();
		}
		// 计算总成绩
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.printf("%d位同学的总分是：%.2f\t平均分是：%.2f", scores.length, sum, sum / scores.length);
	}
}
