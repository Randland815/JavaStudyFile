package javaSourceDemo;

import java.util.Scanner;

public class LuckyNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int price = 12000;
		int guessPrice = 0, count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("猜猜多少钱：（" + ++count + "次）");
			guessPrice = input.nextInt();
			if (guessPrice == price) {
				if (count == 1) {
					System.out.println("恭喜获得价值40万的Mac Pro");
					System.exit(0);
				} else if (count >= 2 && count <= 3) {
					System.out.println("恭喜获得价值12000的iPhone 11 Pro Max");
					System.exit(0);
				} else if (count >= 4 && count <= 5) {
					System.out.println("恭喜获得价值999999999999越南盾的Jvav开发包");
					System.exit(0);
				}
			} else if (5 - count > 0) {
				System.out.println("猜测错误请继续（剩余" + (5 - count) + "次机会）");
			} else {
				System.out.println("没一次猜对，安慰奖送你个老八同款奥利给");
			}
		}
	}
}
