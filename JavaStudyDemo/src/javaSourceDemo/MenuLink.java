package javaSourceDemo;

import java.util.Scanner;

public class MenuLink {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;
		System.out.println("1.进入游戏");
		System.out.println("2.退出游戏");
		System.out.print("请选择：");
		choice = input.nextInt();
		if (choice == 1) {
			System.out.printf("1.打小泽泽\n2.踹小泽泽\n3.盘小泽泽\n");
			System.out.print("请输入选择：");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.printf("1.用手打\n2.用棍子打\n3.用钱砸\n");
				System.out.print("请选择：");
				choice = input.nextInt();
				if (choice == 1)
					System.out.println("小泽泽反手扇了你一巴掌");
				else if (choice == 2)
					System.out.println("小泽泽跳起来锤了你一顿");
				else
					System.out.println("小泽泽开心地笑了并且希望再来一次");
				break;
			case 2:
				System.out.printf("1.踹死\n2.踹个半死\n3.轻轻踹一jio");
				System.out.print("请选择：");
				choice = input.nextInt();
				if (choice == 1)
					System.out.println("小泽泽 卒");
				else if (choice == 2)
					System.out.println("小泽泽 昏 并在醒来之后踹死了你");
				else
					System.out.println("小泽泽礼貌的回了你一jio");
				break;
			case 3:
				System.out.printf("开发中");
				break;
			}
		} else if (choice == 2) {
			System.exit(0);
		} else {
			System.out.println("输入错误，游戏自动退出");
		}
	}
}
