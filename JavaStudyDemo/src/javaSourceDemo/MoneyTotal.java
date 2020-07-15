package javaSourceDemo;

import java.util.Scanner;

public class MoneyTotal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0; // 次数的初值一般为0
		double money = Double.MAX_VALUE; // 赋一个不可能的值，方便后面的判断
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入第" + (i + 1) + "位玩家的消费金额：");
			money = input.nextDouble();
			if (money < 500) {
				count++;
			}
		}
		System.out.println("消费总金额小于500的玩家总数为：" + count);
	}
}
