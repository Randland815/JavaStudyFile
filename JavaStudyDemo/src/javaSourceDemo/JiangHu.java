package javaSourceDemo;

import java.util.Scanner;

public class JiangHu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String info = null;
		System.out.print("�������ɫ������ֵ��");
		int power = input.nextInt();
		if (power >= 0 && power <= 1000)
			info = "����Ǹ���������������";
		else if (power > 1000 && power <= 3000)
			info = "���ֵܹ���";
		System.out.println("���齨�飺" + info);
	}
}