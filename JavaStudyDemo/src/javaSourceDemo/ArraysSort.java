package javaSourceDemo;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		// �������һ������
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.print("����ǰ��");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		Arrays.sort(nums);
		// ���򣺽���β�ߵ�
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
		}
		System.out.println();
		System.out.print("�����");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}