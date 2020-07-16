package javaSourceDemo;

public class BubbleSortDemo {
	public static void main(String[] args) {
		// 使用冒泡排序
		// 1.一共会比较数组元素个数-1轮
		// 2.每一轮，比较的次数比上一次少一
		// 3.如果前面一个数大于/小于后面一个数字，那么交换
		// 随机生成一个数组
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.print("排序前：");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		int temp; // 临时变量
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		// 打印结果
		System.out.println();
		System.out.print("排序后：");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
