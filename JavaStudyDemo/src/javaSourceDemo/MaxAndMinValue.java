package javaSourceDemo;

public class MaxAndMinValue {
	public static void main(String[] args) {
		// 随机生成一个数组，求里面的最大值和最小值
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		// 求最大值最小值
		// 1.假设第一个元素是最大值/最小值
		int max = nums[0];
		int min = nums[0];
		// 2.拿最大值或者最小值逐个在数组中比较，如果某个元素比最大值大/比最小值小，宁行宁上
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				// 如果数组中的某个元素 > max，宁行宁上
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("数组中最大的元素是：" + max);
		System.out.println("数组中最小的元素是：" + min);
	}
}
