package javaSourceDemo;

import java.util.Scanner;

public class MoneyExchanging {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入金额：");
		double money = input.nextDouble();
		// 处理整数部分
		int yuan = (int) money;
		int numOfTens = yuan / 10; // 十元纸币的数量
		int numOfFives = yuan % 10 / 5; // 五元纸币的数量
		int numOfOnes = yuan % 10 - 5; // 一元纸币数量
		// 处理小数部分
		int dime = ((int) (money * 10)) % 10;
		int numOfFiftyCents = dime / 5; // 五角的数量
		int numOfTenCents = dime - 5; // 一角纸币的数量
		System.out.printf("10元纸币的数量：%d\n", numOfTens);
		System.out.printf("5元纸币的数量：%d\n", numOfFives);
		System.out.printf("1元纸币的数量：%d\n", numOfOnes);
	}
}
