package javaSourceDemo;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.声明相关变量
		String password = ""; // 密码
		String userName = ""; // 用户名
		String inputPass = ""; // 用户输入的密码
		String inputUid = "";
		int i = 0; // 循环变量
		// 2.设定用户名密码
		System.out.println("欢迎使用 Maftert IDE for Jvav Developing");
		System.out.println("\t\t注册\t\t");
		System.out.println("----------------------------------------");
		System.out.print("用户名：");
		userName = input.nextLine();
		System.out.print("\n密码：");
		password = input.nextLine();
		// 3.输入3次用户名密码
		System.out.println("\t\t登录\t\t");
		System.out.println("----------------------------------------");
		while (i < 3) {
			System.out.print("用户名：");
			inputUid = input.nextLine();
			System.out.print("\n密码：");
			inputPass = input.nextLine();
			if (inputUid.equals(userName) && inputPass.equals(password)) {
				System.out.println("\t\t欢迎\t\t");
				System.out.println("----------------------------------------");
				System.exit(0);
			} else
				System.out.println("信息错误，请再试一次");
			i++;
		}
		// 4.错误次数太多 滚蛋
		System.out.println("错误次数过多，请明天再试");
	}
}
