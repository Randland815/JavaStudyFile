package javaSourceDemo;

import java.util.Scanner;

public class SearchDemo {
	public static void main(String[] args) {
		// �������һ������
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.print("������ɵ�����Ԫ�أ�");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		// ���û�����Ҫ���ҵ����֣��������飬���Ҷ�Ӧ��Ԫ��
		Scanner input = new Scanner(System.in);
		System.out.print("��������Ҫ���ҵ�Ԫ�أ�");
		int searchNum = input.nextInt();
		int searchIndex = -1;// ��·��һ��Ҫ�ҵ��±꣬��ֵΪ-1
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				searchIndex = i;
				break;
			}
		}
		// �ҵ�������±꣬û���ҵ����������
		if (searchIndex == -1) {
			System.out.println("������û�������");
		} else {
			System.out.printf("���������еĵ�%d����\n", searchIndex + 1);
		}
	}
}