package javaSourceDemo;

import java.util.Scanner;

public class SearchDemo {
	public static void main(String[] args) {
		// 随机生成一个数组
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.print("随机生成的数组元素：");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		// 让用户输入要查找的数字，遍历数组，查找对应的元素
		Scanner input = new Scanner(System.in);
		System.out.print("请输入想要查找的元素：");
		int searchNum = input.nextInt();
		int searchIndex = -1;// 套路：一般要找的下标，初值为-1
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				searchIndex = i;
				break;
			}
		}
		// 找到了输出下标，没有找到输出不存在
		if (searchIndex == -1) {
			System.out.println("数组中没有这个数");
		} else {
			System.out.printf("这是数组中的第%d个数\n", searchIndex + 1);
		}
	}
}
