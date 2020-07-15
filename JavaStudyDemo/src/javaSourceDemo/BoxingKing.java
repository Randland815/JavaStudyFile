package javaSourceDemo;

import java.util.Scanner;

public class BoxingKing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.让用户选名字
		System.out.print("请输入您的名字：");
		String userName = input.next();
		System.out.print("请输入对手的名字：");
		String botName = input.next();
		System.out.println(userName + " V.S. " + botName);
		// 2.初始化双方的参数
		int playerHP = 100, botHP = 100;
		int playerAttack = 0, botAttack = 0;
		// 3.使用循环模拟回合对战过程
		while (playerHP > 0 && botHP >= 0) {
			// 生成随机数字 a ~ b: (int)(Math.random()*10000) % (b - a + 1) + a
			playerAttack = (int) (Math.random() * 10000) % 11 + 5;
			botAttack = (int) (Math.random() * 10000) % 11 + 5;
			// 玩家先发动攻击
			botHP -= playerAttack;
			playerHP -= botAttack;
		}
		// 4.输出最终结果
		System.out.println("KO!");
		System.out.println("玩家姓名\t血量");
		System.out.println("----------------------------------------");
		System.out.printf("%s\t%d\n", userName, playerHP);
		System.out.printf("%s\t%d\n", botName, botHP);
		System.out.println("----------------------------------------");
		if (playerHP > botHP) {
			System.out.printf("%s Win!", userName);
		} else {
			System.out.printf("%s Win!", botName);
		}
	}
}
