package javaSourceDemo;

import java.util.Scanner;

public class BoxingKing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.���û�ѡ����
		System.out.print("�������������֣�");
		String userName = input.next();
		System.out.print("��������ֵ����֣�");
		String botName = input.next();
		System.out.println(userName + " V.S. " + botName);
		// 2.��ʼ��˫���Ĳ���
		int playerHP = 100, botHP = 100;
		int playerAttack = 0, botAttack = 0;
		// 3.ʹ��ѭ��ģ��غ϶�ս����
		while (playerHP > 0 && botHP >= 0) {
			// ����������� a ~ b: (int)(Math.random()*10000) % (b - a + 1) + a
			playerAttack = (int) (Math.random() * 10000) % 11 + 5;
			botAttack = (int) (Math.random() * 10000) % 11 + 5;
			// ����ȷ�������
			botHP -= playerAttack;
			playerHP -= botAttack;
		}
		// 4.������ս��
		System.out.println("KO!");
		System.out.println("�������\tѪ��");
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
