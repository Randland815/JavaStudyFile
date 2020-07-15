package javaSourceDemo;

import java.util.Scanner;

public class ShoppingCartPro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, price1, price2, price3; // 商品单价
		int count; // 购买商品的数量
		double total = 0; // 总价
		// 1.输入三种商品的单价和数量
		System.out.print("请输入MacBook Pro的单价:");
		price1 = price = input.nextDouble();
		System.out.print("请输入商品的数量：");
		count = input.nextInt();
		total += price * count;
		System.out.print("请输入iPhoneXS MAX的单价:");
		price2 = price = input.nextDouble();
		System.out.print("请输入商品的数量：");
		count = input.nextInt();
		total += price * count;
		System.out.print("请输入AirPods Pro的单价:");
		price3 = price = input.nextDouble();
		System.out.print("请输入商品的数量：");
		count = input.nextInt();
		total += price * count;
		// 2.判断是否打折
		if ((price1 > 5000 && price2 > 5000 && price3 > 5000) || (total > 35000))
			total *= 0.3;
		else
			total *= 0.8;
		// 3.输出打折后的价格
		System.out.println("打折后的价格为：" + total);
	}
}