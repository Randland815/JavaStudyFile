package javaSourceDemo;

import java.util.Scanner;

public class HeroInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("生命值：★ ★ ★ ★ ★ ☆ ☆ ☆ ☆ ☆");
		System.out.println("物理攻击：★ ★ ★ ★ ★ ★ ★ ☆ ☆ ☆");
		System.out.println("技能伤害：★ ★ ★ ★ ★ ★ ☆ ☆ ☆ ☆");
		System.out.print("请输入伤害：");
		double attack = input.nextDouble(); // 伤害
		System.out.print("请输入伤害成长值：");
		double attackGrowth = input.nextDouble();
		System.out.printf("\n伤害：%.2f（+%.2f）\n", attack, attackGrowth);
	}
}