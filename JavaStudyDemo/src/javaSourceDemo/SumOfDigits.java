package javaSourceDemo;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.得到要计算的整形数字
		System.out.print("请输入需要计算的数字：");
		int num = input.nextInt(); // 需要计算的数字
		// 2.声明相关变量
		int sum = 0; // 累加和
		// 3.循环计算累加
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		// 4.输出结果
		System.out.println("各位数字之和为：" + sum);
	}
}
