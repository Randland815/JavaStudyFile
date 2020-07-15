package javaSourceDemo;

import java.util.Scanner;

public class MyStudio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y", name = "";
		// 1.打印菜单
		do {
			System.out.print("\n嘿！新来的，告诉我你的名字：");
			name = input.nextLine();
			System.out.print("\n这是你的名字吗？(y/n)：");
			answer = input.nextLine();
		} while (answer.equalsIgnoreCase("n"));
		// 2.输出结果
		System.out.println("\n" + name + " 欢迎加入 MaftertStudio");
	}
}
