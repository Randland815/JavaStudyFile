package javaSourceDemo;

public class OddAndEvenNums {
	public static void main(String[] args) {
		// 随机生成一个数组，求奇数和偶数分别有多少个
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		// 求奇偶数个数
		// 1.声明变量
		int oddNums = 0, evenNums = 0;
		// 2.是2的倍数，evenNums++；反之，oddNums++
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenNums++;
			} else {
				oddNums++;
			}
		}
		System.out.printf("数组中有%d个奇数，%d个偶数", oddNums, evenNums);
	}
}
