package javaSourceDemo;

public class BubbleSortDemo {
	public static void main(String[] args) {
		// ʹ��ð������
		// 1.һ����Ƚ�����Ԫ�ظ���-1��
		// 2.ÿһ�֣��ȽϵĴ�������һ����һ
		// 3.���ǰ��һ��������/С�ں���һ�����֣���ô����
		// �������һ������
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.print("����ǰ��");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		int temp; // ��ʱ����
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		// ��ӡ���
		System.out.println();
		System.out.print("�����");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
