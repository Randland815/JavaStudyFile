package javaSourceDemo;

public class SelectionSortDemo {
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
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					minIndex = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
		System.out.println();
		System.out.print("�����");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
