package javaSourceDemo;

import java.util.Scanner;

public class JiangHu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String info = null;
		System.out.print("请输入角色的内力值：");
		int power = input.nextInt();
		if (power >= 0 && power <= 1000)
			info = "这就是个渣渣，打了脏手";
		else if (power > 1000 && power <= 3000)
			info = "送兄弟归西";
		System.out.println("友情建议：" + info);
	}
}