package javaSourceDemo;

import java.util.Scanner;

public class MenuLink {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;
		System.out.println("1.������Ϸ");
		System.out.println("2.�˳���Ϸ");
		System.out.print("��ѡ��");
		choice = input.nextInt();
		if (choice == 1) {
			System.out.printf("1.��С����\n2.��С����\n3.��С����\n");
			System.out.print("������ѡ��");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.printf("1.���ִ�\n2.�ù��Ӵ�\n3.��Ǯ��\n");
				System.out.print("��ѡ��");
				choice = input.nextInt();
				if (choice == 1)
					System.out.println("С������������һ����");
				else if (choice == 2)
					System.out.println("С����������������һ��");
				else
					System.out.println("С�����ĵ�Ц�˲���ϣ������һ��");
				break;
			case 2:
				System.out.printf("1.����\n2.�߸�����\n3.������һjio");
				System.out.print("��ѡ��");
				choice = input.nextInt();
				if (choice == 1)
					System.out.println("С���� ��");
				else if (choice == 2)
					System.out.println("С���� �� ��������֮����������");
				else
					System.out.println("С������ò�Ļ�����һjio");
				break;
			case 3:
				System.out.printf("������");
				break;
			}
		} else if (choice == 2) {
			System.exit(0);
		} else {
			System.out.println("���������Ϸ�Զ��˳�");
		}
	}
}
