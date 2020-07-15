package javaSourceDemo;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price; // 商品单价
		int count; // 购买商品的数量
		double total = 0; // 总价
		// 1.输入三种商品的单价和数量
		System.out.print("请输入MacBook Pro的单价:");
		price = input.nextDouble();
		System.out.print("请输入商品的数量：");
		count = input.nextInt();
		total += price * count;
		System.out.print("请输入iPhoneXS MAX的单价:");
		price = input.nextDouble();
		System.out.print("请输入商品的数量：");
		count = input.nextInt();
		total += price * count;
		System.out.print("请输入AirPods Pro的单价:");
		price = input.nextDouble();
		System.out.print("请输入商品的数量：");
		count = input.nextInt();
		total += price * count;
		// 2.判断是否打折
		if (total >= 50000)
			total *= 0.7;
		else
			total *= 0.9;
		// 3.输出打折后的价格
		System.out.println("打折后的价格为：" + total);
	}
}
