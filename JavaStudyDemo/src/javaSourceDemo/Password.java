package javaSourceDemo;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.������ر���
		String password = ""; // ����
		String userName = ""; // �û���
		String inputPass = ""; // �û����������
		String inputUid = "";
		int i = 0; // ѭ������
		// 2.�趨�û�������
		System.out.println("��ӭʹ�� Maftert IDE for Jvav Developing");
		System.out.println("\t\tע��\t\t");
		System.out.println("----------------------------------------");
		System.out.print("�û�����");
		userName = input.nextLine();
		System.out.print("\n���룺");
		password = input.nextLine();
		// 3.����3���û�������
		System.out.println("\t\t��¼\t\t");
		System.out.println("----------------------------------------");
		while (i < 3) {
			System.out.print("�û�����");
			inputUid = input.nextLine();
			System.out.print("\n���룺");
			inputPass = input.nextLine();
			if (inputUid.equals(userName) && inputPass.equals(password)) {
				System.out.println("\t\t��ӭ\t\t");
				System.out.println("----------------------------------------");
				System.exit(0);
			} else
				System.out.println("��Ϣ����������һ��");
			i++;
		}
		// 4.�������̫�� ����
		System.out.println("����������࣬����������");
	}
}
